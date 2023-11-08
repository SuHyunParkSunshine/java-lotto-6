package lotto.service;

import lotto.domain.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class UserInputDataServiceTest {
    private UserInputDataService userInputDataService = new UserInputDataService();

    @DisplayName("구매금액 반환 테스트")
    @Test
    public void getBuyingPriceTest() {
        // given
        int buyingPrice = 1000;
        User user = new User(buyingPrice);
        // when
        int result = userInputDataService.getBuyingPrice(user);
        // then
        assertThat(result).isEqualTo(buyingPrice);
    }
}
