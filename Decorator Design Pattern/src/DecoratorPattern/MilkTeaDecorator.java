package DecoratorPattern;

public class MilkTeaDecorator implements IMilkTea{

    protected IMilkTea milkTea;

    /**
     * dùng cho việc khởi tạo, bắt các class kế thửa phải overide lại
     * @param inner: một kiểu dữ liệu trừu trượng giúp việc khởi tạo
     */
    public MilkTeaDecorator(IMilkTea inner) {
        this.milkTea = inner;
    }

    @Override
    public double Cost() {
        return milkTea.Cost();
    }
}
