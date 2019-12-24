package com.my.mixed;

import com.my.mixed.entity.User;
import com.my.mixed.util.Pinyin4JUtil;
import org.springframework.util.StringUtils;

public class MyMixedQuery {
    private String setMixedQueryUDN(User param) {
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
        return mixedQuery.toString();
    }

    public static void main(String[] args) {
        User user = new User();
        user.setName("松江");
        user.setAddress("梁山");
        user.setAge(55);
        String result = new MyMixedQuery().setMixedQueryUDN(user);
        System.out.println(result);
    }
}
