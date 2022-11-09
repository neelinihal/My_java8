public class Button {
    private String title;
    private OnClickListner onClickListner;

    public Button(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setOnClickListner(OnClickListner onClickListner) {
        this.onClickListner = onClickListner;
    }

    public void onClick() {
        this.onClickListner.onclick(this.title);
    }

    public interface OnClickListner{
        public void onclick(String title);
    }
}
