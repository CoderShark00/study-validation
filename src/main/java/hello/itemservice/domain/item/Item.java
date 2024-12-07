package hello.itemservice.domain.item;

import lombok.Data;
import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.ScriptAssert;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class Item {

  //  @NotNull(groups = UpdateCheck.class) // 수정 요구사항 추가
    private Long id;

  //  @NotBlank(groups = {SaveCheck.class, UpdateCheck.class})
    private String itemName;

 //   @NotNull(groups = {SaveCheck.class, UpdateCheck.class}, message = "숫자를 입력해주세요")
 //   @Range(min=1000, max= 1000000, groups = {SaveCheck.class, UpdateCheck.class})
    private Integer price;

//    @NotNull(groups = {SaveCheck.class, UpdateCheck.class}, message = "수량을 입력해주세요.")
//   @Max(value = 9999, groups = {SaveCheck.class})
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
