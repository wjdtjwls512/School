package encapsultion;

public class PhoneStore {
    private Phone phone;

    public PhoneStore(Phone phone) {
        this.phone = phone;
    }

    // 판매가 가능하면 핀매할 폰을 반환, 판매가 불가능하면 null 반환
    public Phone sellPhone(String model, double budget) {
        // 폰 가격보다 고객의 예산이 크거나 같고 모델이 같으면 판매 가능
        if (phone.getPrice() <= budget && model.equals(phone.getModel())) {
            // 요금제를 등록
            // 할일
            // 데이터를 저장하고 새로운 폰으로 이동
            return phone;
        } else {
            return null;
        }
    }

    private void registerPayment() {
        System.out.println();
    }
}
