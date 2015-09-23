# hint_spinner
spinner with hint text
##user manual
First specify string array with hint text as the last item, eg:
<p>&lt;string-array name="array_baby_sex_hint"></p>
        <item>男<item>
        <item>女<item>
        <item>请选择宝宝性别<item>
&lt;/string-array>

Then use it in your code:
<p2>MyAdapter&lt;String> myAdapter = new DefaultArrayAdapter(getActivity(), android.R.layout.simple_spinner_dropdown_item);
myAdapter.addAll(getResources().getStringArray(R.array.array_baby_sex_hint));
MySpinner.setAdapter(myAdapter);
MySpinner.setSelection(MySpinner.getCount());</p2>

You can modify the layout as you expect.
