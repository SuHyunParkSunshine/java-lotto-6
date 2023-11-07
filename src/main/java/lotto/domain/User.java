package lotto.domain;

import java.util.ArrayList;
import java.util.List;

// 로또 구매 및 저장, 구매 금액과 총 상금 관리
public class User {
    private int buyingPrice;
    private int winningPrice;
    private List<UserLotto> lottos;

    public User(int buyingPrice) {
        lottos = new ArrayList<>();
        this.buyingPrice = buyingPrice;
        this.winningPrice = 0;
    }
}
