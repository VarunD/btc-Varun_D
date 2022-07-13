<html>
<body>
<h2>Food Ordering App</h2>
<form method ="post" action="FoodApp">
	<b>Enter new item to Menu</b></br>
	</br>
	Menu Id<input type="number" name="menuid"></br>
	Item name<input type="text" name="itemname"></br>
	Status <input type="text" name="status"></br>
	Price<input type="number"name="price"></br>
	category<input type="text" name="category"></br>
	<button type="submit">submit</button>
</form>


<form method ="get" action="FoodApp">
<b>Food App items are</b>

</br>
<button type="submit">Display</button>
</form>


<form method ="Delete" action="FoodApp">
<b>Delete an item  form the menu</b>
</br>
Menu item ID<input type="number" name="removeId"></br>
<button type="submit">submit</button>
</form>



<form method ="post" action="FoodApp">
<b>Update item</b>
</br>
update item ID<input type="number" name="updateid"></br>
Item name<input type="text" name="updatename"></br>
status<input type="text" name="updatestatus"></br>
Price<input type="number" name="updateprice"></br>
Category<input type="text" name="updatecategory"></br>
<button type="submit">Update</button>
</form>

</body>
</html>
