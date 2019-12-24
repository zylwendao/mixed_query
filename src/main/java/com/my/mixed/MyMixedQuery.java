package com.my.mixed;

import com.my.mixed.entity.User;
import com.my.mixed.util.Pinyin4JUtil;
import org.springframework.util.StringUtils;

public class MyMixedQuery {
    private void setMixedQueryUDN(User param) {
        StringBuilder mixedQuery = new StringBuilder();
        if (!StringUtils.isEmpty(param.getName())) {
            mixedQuery.append(param.getName());
            mixedQuery.append("|");
            mixedQuery.append(Pinyin4JUtil.toPinyinNew(param.getName(), Pinyin4JUtil.PinyinType.HEAD));
            mixedQuery.append("|");
            mixedQuery.append(Pinyin4JUtil.toPinyinNew(param.getName(), Pinyin4JUtil.PinyinType.FULL));
            mixedQuery.append("|");
            mixedQuery.append(param.getAddress());//
            mixedQuery.append("|");
            mixedQuery.append(Pinyin4JUtil.toPinyinNew(param.getAddress(), Pinyin4JUtil.PinyinType.HEAD));
            mixedQuery.append("|");
            mixedQuery.append(Pinyin4JUtil.toPinyinNew(param.getAddress(), Pinyin4JUtil.PinyinType.FULL));
            mixedQuery.append("|");
            mixedQuery.append(param.getAge());
        }
        param.setMixedQuery(mixedQuery.toString());
    }
}
