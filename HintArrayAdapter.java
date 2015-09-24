public class DefaultArrayAdapter extends ArrayAdapter<String>{
    public DefaultArrayAdapter(Context context, int resource) {
        super(context, resource);
        this.setDropDownViewResource(R.layout.spinner_layout);
    }

    @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View v = super.getView(position, convertView, parent);
            TextView textView = ((TextView)v.findViewById(android.R.id.text1));
            textView.setTextAppearance(parent.getContext(), R.style.value_text_style);
            textView.setGravity(Gravity.RIGHT|Gravity.CENTER_VERTICAL);
            if (position == getCount()) {
                textView.setText("");
                textView.setHint(getItem(getCount())); //"Hint to be displayed"
            }
            return v;
        }

    @Override
        public int getCount() {
            return super.getCount()-1; // you dont display last item. It is used as hint.
        }
}
