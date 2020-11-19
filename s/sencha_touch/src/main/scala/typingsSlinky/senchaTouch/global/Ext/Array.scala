package typingsSlinky.senchaTouch.global.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.Array")
@js.native
class Array ()
  extends typingsSlinky.senchaTouch.Ext.Array
/* static members */
@JSGlobal("Ext.Array")
@js.native
object Array extends js.Object {
  
  /** [Method] Filter through an array and remove empty item as defined in Ext isEmpty
    * @param array Array
    * @returns Array results
    */
  def clean(): typingsSlinky.senchaTouch.Ext.Array = js.native
  def clean(array: typingsSlinky.senchaTouch.Ext.Array): typingsSlinky.senchaTouch.Ext.Array = js.native
  
  def clone(array: typingsSlinky.senchaTouch.Ext.Array): typingsSlinky.senchaTouch.Ext.Array = js.native
  
  /** [Method] Checks whether or not the given array contains the specified item
    * @param array Array The array to check.
    * @param item Object The item to look for.
    * @returns Boolean true if the array contains the item, false otherwise.
    */
  def contains(): Boolean = js.native
  def contains(array: js.UndefOr[scala.Nothing], item: js.Any): Boolean = js.native
  def contains(array: typingsSlinky.senchaTouch.Ext.Array): Boolean = js.native
  def contains(array: typingsSlinky.senchaTouch.Ext.Array, item: js.Any): Boolean = js.native
  
  /** [Method] Perform a set difference A B by subtracting all items in array B from array A
    * @param arrayA Array
    * @param arrayB Array
    * @returns Array difference
    */
  def difference(): typingsSlinky.senchaTouch.Ext.Array = js.native
  def difference(arrayA: js.UndefOr[scala.Nothing], arrayB: typingsSlinky.senchaTouch.Ext.Array): typingsSlinky.senchaTouch.Ext.Array = js.native
  def difference(arrayA: typingsSlinky.senchaTouch.Ext.Array): typingsSlinky.senchaTouch.Ext.Array = js.native
  def difference(arrayA: typingsSlinky.senchaTouch.Ext.Array, arrayB: typingsSlinky.senchaTouch.Ext.Array): typingsSlinky.senchaTouch.Ext.Array = js.native
  
  /** [Method] Iterates an array or an iterable value and invoke the given callback function for each item
    * @param iterable Array/NodeList/Object The value to be iterated. If this argument is not iterable, the callback function is called once.
    * @param fn Function The callback function. If it returns false, the iteration stops and this method returns the current index.
    * @param scope Object The scope (this reference) in which the specified function is executed.
    * @param reverse Boolean Reverse the iteration order (loop from the end to the beginning).
    * @returns Boolean See description for the fn parameter.
    */
  def each(): Boolean = js.native
  def each(
    iterable: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    reverse: Boolean
  ): Boolean = js.native
  def each(iterable: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Boolean = js.native
  def each(
    iterable: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.Any,
    reverse: Boolean
  ): Boolean = js.native
  def each(iterable: js.UndefOr[scala.Nothing], fn: js.Any): Boolean = js.native
  def each(
    iterable: js.UndefOr[scala.Nothing],
    fn: js.Any,
    scope: js.UndefOr[scala.Nothing],
    reverse: Boolean
  ): Boolean = js.native
  def each(iterable: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Boolean = js.native
  def each(iterable: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, reverse: Boolean): Boolean = js.native
  def each(iterable: js.Any): Boolean = js.native
  def each(
    iterable: js.Any,
    fn: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    reverse: Boolean
  ): Boolean = js.native
  def each(iterable: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Boolean = js.native
  def each(iterable: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, reverse: Boolean): Boolean = js.native
  def each(iterable: js.Any, fn: js.Any): Boolean = js.native
  def each(iterable: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], reverse: Boolean): Boolean = js.native
  def each(iterable: js.Any, fn: js.Any, scope: js.Any): Boolean = js.native
  def each(iterable: js.Any, fn: js.Any, scope: js.Any, reverse: Boolean): Boolean = js.native
  
  /** [Method] Removes items from an array
    * @param array Array The Array on which to replace.
    * @param index Number The index in the array at which to operate.
    * @param removeCount Number The number of items to remove at index.
    * @returns Array The array passed.
    */
  def erase(): typingsSlinky.senchaTouch.Ext.Array = js.native
  def erase(array: js.UndefOr[scala.Nothing], index: js.UndefOr[scala.Nothing], removeCount: Double): typingsSlinky.senchaTouch.Ext.Array = js.native
  def erase(array: js.UndefOr[scala.Nothing], index: Double): typingsSlinky.senchaTouch.Ext.Array = js.native
  def erase(array: js.UndefOr[scala.Nothing], index: Double, removeCount: Double): typingsSlinky.senchaTouch.Ext.Array = js.native
  def erase(array: typingsSlinky.senchaTouch.Ext.Array): typingsSlinky.senchaTouch.Ext.Array = js.native
  def erase(array: typingsSlinky.senchaTouch.Ext.Array, index: js.UndefOr[scala.Nothing], removeCount: Double): typingsSlinky.senchaTouch.Ext.Array = js.native
  def erase(array: typingsSlinky.senchaTouch.Ext.Array, index: Double): typingsSlinky.senchaTouch.Ext.Array = js.native
  def erase(array: typingsSlinky.senchaTouch.Ext.Array, index: Double, removeCount: Double): typingsSlinky.senchaTouch.Ext.Array = js.native
  
  /** [Method] Executes the specified function for each array element until the function returns a falsy value
    * @param array Array
    * @param fn Function Callback function for each item.
    * @param scope Object Callback function scope.
    * @returns Boolean true if no false value is returned by the callback function.
    */
  def every(): Boolean = js.native
  def every(array: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Boolean = js.native
  def every(array: js.UndefOr[scala.Nothing], fn: js.Any): Boolean = js.native
  def every(array: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Boolean = js.native
  def every(array: typingsSlinky.senchaTouch.Ext.Array): Boolean = js.native
  def every(array: typingsSlinky.senchaTouch.Ext.Array, fn: js.UndefOr[scala.Nothing], scope: js.Any): Boolean = js.native
  def every(array: typingsSlinky.senchaTouch.Ext.Array, fn: js.Any): Boolean = js.native
  def every(array: typingsSlinky.senchaTouch.Ext.Array, fn: js.Any, scope: js.Any): Boolean = js.native
  
  /** [Method] Creates a new array with all of the elements of this array for which the provided filtering function returns true
    * @param array Array
    * @param fn Function Callback function for each item.
    * @param scope Object Callback function scope.
    * @returns Array results
    */
  def filter(): typingsSlinky.senchaTouch.Ext.Array = js.native
  def filter(array: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): typingsSlinky.senchaTouch.Ext.Array = js.native
  def filter(array: js.UndefOr[scala.Nothing], fn: js.Any): typingsSlinky.senchaTouch.Ext.Array = js.native
  def filter(array: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): typingsSlinky.senchaTouch.Ext.Array = js.native
  def filter(array: typingsSlinky.senchaTouch.Ext.Array): typingsSlinky.senchaTouch.Ext.Array = js.native
  def filter(array: typingsSlinky.senchaTouch.Ext.Array, fn: js.UndefOr[scala.Nothing], scope: js.Any): typingsSlinky.senchaTouch.Ext.Array = js.native
  def filter(array: typingsSlinky.senchaTouch.Ext.Array, fn: js.Any): typingsSlinky.senchaTouch.Ext.Array = js.native
  def filter(array: typingsSlinky.senchaTouch.Ext.Array, fn: js.Any, scope: js.Any): typingsSlinky.senchaTouch.Ext.Array = js.native
  
  /** [Method] Recursively flattens into 1 d Array
    * @param array Array The array to flatten
    * @returns Array The 1-d array.
    */
  def flatten(): typingsSlinky.senchaTouch.Ext.Array = js.native
  def flatten(array: typingsSlinky.senchaTouch.Ext.Array): typingsSlinky.senchaTouch.Ext.Array = js.native
  
  /** [Method] Iterates an array and invoke the given callback function for each item
    * @param array Array The array to iterate.
    * @param fn Function The callback function.
    * @param scope Object The execution scope (this) in which the specified function is executed.
    */
  def forEach(): Unit = js.native
  def forEach(array: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  def forEach(array: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
  def forEach(array: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
  def forEach(array: typingsSlinky.senchaTouch.Ext.Array): Unit = js.native
  def forEach(array: typingsSlinky.senchaTouch.Ext.Array, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  def forEach(array: typingsSlinky.senchaTouch.Ext.Array, fn: js.Any): Unit = js.native
  def forEach(array: typingsSlinky.senchaTouch.Ext.Array, fn: js.Any, scope: js.Any): Unit = js.native
  
  /** [Method] Converts a value to an array if it s not already an array returns An empty array if given value is undefined or n
    * @param value Object The value to convert to an array if it's not already is an array.
    * @param newReference Boolean true to clone the given array and return a new reference if necessary.
    * @returns Array array
    */
  def from(): typingsSlinky.senchaTouch.Ext.Array = js.native
  def from(value: js.UndefOr[scala.Nothing], newReference: Boolean): typingsSlinky.senchaTouch.Ext.Array = js.native
  def from(value: js.Any): typingsSlinky.senchaTouch.Ext.Array = js.native
  def from(value: js.Any, newReference: Boolean): typingsSlinky.senchaTouch.Ext.Array = js.native
  
  /** [Method] Push an item into the array only if the array doesn t contain it yet
    * @param array Array The array.
    * @param item Object The item to include.
    */
  def include(): Unit = js.native
  def include(array: js.UndefOr[scala.Nothing], item: js.Any): Unit = js.native
  def include(array: typingsSlinky.senchaTouch.Ext.Array): Unit = js.native
  def include(array: typingsSlinky.senchaTouch.Ext.Array, item: js.Any): Unit = js.native
  
  /** [Method] Get the index of the provided item in the given array a supplement for the missing arrayPrototype indexOf in Interne
    * @param array Array The array to check.
    * @param item Object The item to look for.
    * @param from Number The index at which to begin the search.
    * @returns Number The index of item in the array (or -1 if it is not found).
    */
  def indexOf(): Double = js.native
  def indexOf(array: js.UndefOr[scala.Nothing], item: js.UndefOr[scala.Nothing], from: Double): Double = js.native
  def indexOf(array: js.UndefOr[scala.Nothing], item: js.Any): Double = js.native
  def indexOf(array: js.UndefOr[scala.Nothing], item: js.Any, from: Double): Double = js.native
  def indexOf(array: typingsSlinky.senchaTouch.Ext.Array): Double = js.native
  def indexOf(array: typingsSlinky.senchaTouch.Ext.Array, item: js.UndefOr[scala.Nothing], from: Double): Double = js.native
  def indexOf(array: typingsSlinky.senchaTouch.Ext.Array, item: js.Any): Double = js.native
  def indexOf(array: typingsSlinky.senchaTouch.Ext.Array, item: js.Any, from: Double): Double = js.native
  
  /** [Method] Inserts items in to an array
    * @param array Array The Array on which to replace.
    * @param index Number The index in the array at which to operate.
    * @param items Array The array of items to insert at index.
    * @returns Array The array passed.
    */
  def insert(): typingsSlinky.senchaTouch.Ext.Array = js.native
  def insert(
    array: js.UndefOr[scala.Nothing],
    index: js.UndefOr[scala.Nothing],
    items: typingsSlinky.senchaTouch.Ext.Array
  ): typingsSlinky.senchaTouch.Ext.Array = js.native
  def insert(array: js.UndefOr[scala.Nothing], index: Double): typingsSlinky.senchaTouch.Ext.Array = js.native
  def insert(array: js.UndefOr[scala.Nothing], index: Double, items: typingsSlinky.senchaTouch.Ext.Array): typingsSlinky.senchaTouch.Ext.Array = js.native
  def insert(array: typingsSlinky.senchaTouch.Ext.Array): typingsSlinky.senchaTouch.Ext.Array = js.native
  def insert(
    array: typingsSlinky.senchaTouch.Ext.Array,
    index: js.UndefOr[scala.Nothing],
    items: typingsSlinky.senchaTouch.Ext.Array
  ): typingsSlinky.senchaTouch.Ext.Array = js.native
  def insert(array: typingsSlinky.senchaTouch.Ext.Array, index: Double): typingsSlinky.senchaTouch.Ext.Array = js.native
  def insert(
    array: typingsSlinky.senchaTouch.Ext.Array,
    index: Double,
    items: typingsSlinky.senchaTouch.Ext.Array
  ): typingsSlinky.senchaTouch.Ext.Array = js.native
  
  /** [Method] Merge multiple arrays into one with unique items that exist in all of the arrays
    * @param array1 Array
    * @param array2 Array
    * @param etc Array
    * @returns Array intersect
    */
  def intersect(): typingsSlinky.senchaTouch.Ext.Array = js.native
  def intersect(
    array1: js.UndefOr[scala.Nothing],
    array2: js.UndefOr[scala.Nothing],
    etc: typingsSlinky.senchaTouch.Ext.Array
  ): typingsSlinky.senchaTouch.Ext.Array = js.native
  def intersect(array1: js.UndefOr[scala.Nothing], array2: typingsSlinky.senchaTouch.Ext.Array): typingsSlinky.senchaTouch.Ext.Array = js.native
  def intersect(
    array1: js.UndefOr[scala.Nothing],
    array2: typingsSlinky.senchaTouch.Ext.Array,
    etc: typingsSlinky.senchaTouch.Ext.Array
  ): typingsSlinky.senchaTouch.Ext.Array = js.native
  def intersect(array1: typingsSlinky.senchaTouch.Ext.Array): typingsSlinky.senchaTouch.Ext.Array = js.native
  def intersect(
    array1: typingsSlinky.senchaTouch.Ext.Array,
    array2: js.UndefOr[scala.Nothing],
    etc: typingsSlinky.senchaTouch.Ext.Array
  ): typingsSlinky.senchaTouch.Ext.Array = js.native
  def intersect(array1: typingsSlinky.senchaTouch.Ext.Array, array2: typingsSlinky.senchaTouch.Ext.Array): typingsSlinky.senchaTouch.Ext.Array = js.native
  def intersect(
    array1: typingsSlinky.senchaTouch.Ext.Array,
    array2: typingsSlinky.senchaTouch.Ext.Array,
    etc: typingsSlinky.senchaTouch.Ext.Array
  ): typingsSlinky.senchaTouch.Ext.Array = js.native
  
  /** [Method] Creates a new array with the results of calling a provided function on every element in this array
    * @param array Array
    * @param fn Function Callback function for each item.
    * @param scope Object Callback function scope.
    * @returns Array results
    */
  def map(): typingsSlinky.senchaTouch.Ext.Array = js.native
  def map(array: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): typingsSlinky.senchaTouch.Ext.Array = js.native
  def map(array: js.UndefOr[scala.Nothing], fn: js.Any): typingsSlinky.senchaTouch.Ext.Array = js.native
  def map(array: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): typingsSlinky.senchaTouch.Ext.Array = js.native
  def map(array: typingsSlinky.senchaTouch.Ext.Array): typingsSlinky.senchaTouch.Ext.Array = js.native
  def map(array: typingsSlinky.senchaTouch.Ext.Array, fn: js.UndefOr[scala.Nothing], scope: js.Any): typingsSlinky.senchaTouch.Ext.Array = js.native
  def map(array: typingsSlinky.senchaTouch.Ext.Array, fn: js.Any): typingsSlinky.senchaTouch.Ext.Array = js.native
  def map(array: typingsSlinky.senchaTouch.Ext.Array, fn: js.Any, scope: js.Any): typingsSlinky.senchaTouch.Ext.Array = js.native
  
  /** [Method] Returns the maximum value in the Array
    * @param array Array/NodeList The Array from which to select the maximum value.
    * @param comparisonFn Function a function to perform the comparison which determines maximization. If omitted the ">" operator will be used. Note: gt = 1; eq = 0; lt = -1
    * @returns Object maxValue The maximum value
    */
  def max(): js.Any = js.native
  def max(array: js.UndefOr[scala.Nothing], comparisonFn: js.Any): js.Any = js.native
  def max(array: js.Any): js.Any = js.native
  def max(array: js.Any, comparisonFn: js.Any): js.Any = js.native
  
  /** [Method] Calculates the mean of all items in the array
    * @param array Array The Array to calculate the mean value of.
    * @returns Number The mean.
    */
  def mean(): Double = js.native
  def mean(array: typingsSlinky.senchaTouch.Ext.Array): Double = js.native
  
  /** [Method] Merge multiple arrays into one with unique items
    * @param array1 Array
    * @param array2 Array
    * @param etc Array
    * @returns Array merged
    */
  def merge(): typingsSlinky.senchaTouch.Ext.Array = js.native
  def merge(
    array1: js.UndefOr[scala.Nothing],
    array2: js.UndefOr[scala.Nothing],
    etc: typingsSlinky.senchaTouch.Ext.Array
  ): typingsSlinky.senchaTouch.Ext.Array = js.native
  def merge(array1: js.UndefOr[scala.Nothing], array2: typingsSlinky.senchaTouch.Ext.Array): typingsSlinky.senchaTouch.Ext.Array = js.native
  def merge(
    array1: js.UndefOr[scala.Nothing],
    array2: typingsSlinky.senchaTouch.Ext.Array,
    etc: typingsSlinky.senchaTouch.Ext.Array
  ): typingsSlinky.senchaTouch.Ext.Array = js.native
  def merge(array1: typingsSlinky.senchaTouch.Ext.Array): typingsSlinky.senchaTouch.Ext.Array = js.native
  def merge(
    array1: typingsSlinky.senchaTouch.Ext.Array,
    array2: js.UndefOr[scala.Nothing],
    etc: typingsSlinky.senchaTouch.Ext.Array
  ): typingsSlinky.senchaTouch.Ext.Array = js.native
  def merge(array1: typingsSlinky.senchaTouch.Ext.Array, array2: typingsSlinky.senchaTouch.Ext.Array): typingsSlinky.senchaTouch.Ext.Array = js.native
  def merge(
    array1: typingsSlinky.senchaTouch.Ext.Array,
    array2: typingsSlinky.senchaTouch.Ext.Array,
    etc: typingsSlinky.senchaTouch.Ext.Array
  ): typingsSlinky.senchaTouch.Ext.Array = js.native
  
  /** [Method] Returns the minimum value in the Array
    * @param array Array/NodeList The Array from which to select the minimum value.
    * @param comparisonFn Function a function to perform the comparison which determines minimization. If omitted the "&lt;" operator will be used. Note: gt = 1; eq = 0; lt = -1
    * @returns Object minValue The minimum value.
    */
  def min(): js.Any = js.native
  def min(array: js.UndefOr[scala.Nothing], comparisonFn: js.Any): js.Any = js.native
  def min(array: js.Any): js.Any = js.native
  def min(array: js.Any, comparisonFn: js.Any): js.Any = js.native
  
  /** [Method] Plucks the value of a property from each item in the Array
    * @param array Array/NodeList The Array of items to pluck the value from.
    * @param propertyName String The property name to pluck from each element.
    * @returns Array The value from each item in the Array.
    */
  def pluck(): typingsSlinky.senchaTouch.Ext.Array = js.native
  def pluck(array: js.UndefOr[scala.Nothing], propertyName: java.lang.String): typingsSlinky.senchaTouch.Ext.Array = js.native
  def pluck(array: js.Any): typingsSlinky.senchaTouch.Ext.Array = js.native
  def pluck(array: js.Any, propertyName: java.lang.String): typingsSlinky.senchaTouch.Ext.Array = js.native
  
  /** [Method] Removes the specified item from the array if it exists
    * @param array Array The array.
    * @param item Object The item to remove.
    * @returns Array The passed array itself.
    */
  def remove(): typingsSlinky.senchaTouch.Ext.Array = js.native
  def remove(array: js.UndefOr[scala.Nothing], item: js.Any): typingsSlinky.senchaTouch.Ext.Array = js.native
  def remove(array: typingsSlinky.senchaTouch.Ext.Array): typingsSlinky.senchaTouch.Ext.Array = js.native
  def remove(array: typingsSlinky.senchaTouch.Ext.Array, item: js.Any): typingsSlinky.senchaTouch.Ext.Array = js.native
  
  /** [Method] Replaces items in an array
    * @param array Array The Array on which to replace.
    * @param index Number The index in the array at which to operate.
    * @param removeCount Number The number of items to remove at index (can be 0).
    * @param insert Array An array of items to insert at index.
    * @returns Array The array passed.
    */
  def replace(): typingsSlinky.senchaTouch.Ext.Array = js.native
  def replace(
    array: js.UndefOr[scala.Nothing],
    index: js.UndefOr[scala.Nothing],
    removeCount: js.UndefOr[scala.Nothing],
    insert: typingsSlinky.senchaTouch.Ext.Array
  ): typingsSlinky.senchaTouch.Ext.Array = js.native
  def replace(array: js.UndefOr[scala.Nothing], index: js.UndefOr[scala.Nothing], removeCount: Double): typingsSlinky.senchaTouch.Ext.Array = js.native
  def replace(
    array: js.UndefOr[scala.Nothing],
    index: js.UndefOr[scala.Nothing],
    removeCount: Double,
    insert: typingsSlinky.senchaTouch.Ext.Array
  ): typingsSlinky.senchaTouch.Ext.Array = js.native
  def replace(array: js.UndefOr[scala.Nothing], index: Double): typingsSlinky.senchaTouch.Ext.Array = js.native
  def replace(
    array: js.UndefOr[scala.Nothing],
    index: Double,
    removeCount: js.UndefOr[scala.Nothing],
    insert: typingsSlinky.senchaTouch.Ext.Array
  ): typingsSlinky.senchaTouch.Ext.Array = js.native
  def replace(array: js.UndefOr[scala.Nothing], index: Double, removeCount: Double): typingsSlinky.senchaTouch.Ext.Array = js.native
  def replace(
    array: js.UndefOr[scala.Nothing],
    index: Double,
    removeCount: Double,
    insert: typingsSlinky.senchaTouch.Ext.Array
  ): typingsSlinky.senchaTouch.Ext.Array = js.native
  def replace(array: typingsSlinky.senchaTouch.Ext.Array): typingsSlinky.senchaTouch.Ext.Array = js.native
  def replace(
    array: typingsSlinky.senchaTouch.Ext.Array,
    index: js.UndefOr[scala.Nothing],
    removeCount: js.UndefOr[scala.Nothing],
    insert: typingsSlinky.senchaTouch.Ext.Array
  ): typingsSlinky.senchaTouch.Ext.Array = js.native
  def replace(array: typingsSlinky.senchaTouch.Ext.Array, index: js.UndefOr[scala.Nothing], removeCount: Double): typingsSlinky.senchaTouch.Ext.Array = js.native
  def replace(
    array: typingsSlinky.senchaTouch.Ext.Array,
    index: js.UndefOr[scala.Nothing],
    removeCount: Double,
    insert: typingsSlinky.senchaTouch.Ext.Array
  ): typingsSlinky.senchaTouch.Ext.Array = js.native
  def replace(array: typingsSlinky.senchaTouch.Ext.Array, index: Double): typingsSlinky.senchaTouch.Ext.Array = js.native
  def replace(
    array: typingsSlinky.senchaTouch.Ext.Array,
    index: Double,
    removeCount: js.UndefOr[scala.Nothing],
    insert: typingsSlinky.senchaTouch.Ext.Array
  ): typingsSlinky.senchaTouch.Ext.Array = js.native
  def replace(array: typingsSlinky.senchaTouch.Ext.Array, index: Double, removeCount: Double): typingsSlinky.senchaTouch.Ext.Array = js.native
  def replace(
    array: typingsSlinky.senchaTouch.Ext.Array,
    index: Double,
    removeCount: Double,
    insert: typingsSlinky.senchaTouch.Ext.Array
  ): typingsSlinky.senchaTouch.Ext.Array = js.native
  
  /** [Method] Returns a shallow copy of a part of an array
    * @param array Array The array (or arguments object).
    * @param begin Number The index at which to begin. Negative values are offsets from the end of the array.
    * @param end Number The index at which to end. The copied items do not include end. Negative values are offsets from the end of the array. If end is omitted, all items up to the end of the array are copied.
    * @returns Array The copied piece of the array.
    */
  def slice(): typingsSlinky.senchaTouch.Ext.Array = js.native
  def slice(array: js.UndefOr[scala.Nothing], begin: js.UndefOr[scala.Nothing], end: Double): typingsSlinky.senchaTouch.Ext.Array = js.native
  def slice(array: js.UndefOr[scala.Nothing], begin: Double): typingsSlinky.senchaTouch.Ext.Array = js.native
  def slice(array: js.UndefOr[scala.Nothing], begin: Double, end: Double): typingsSlinky.senchaTouch.Ext.Array = js.native
  def slice(array: typingsSlinky.senchaTouch.Ext.Array): typingsSlinky.senchaTouch.Ext.Array = js.native
  def slice(array: typingsSlinky.senchaTouch.Ext.Array, begin: js.UndefOr[scala.Nothing], end: Double): typingsSlinky.senchaTouch.Ext.Array = js.native
  def slice(array: typingsSlinky.senchaTouch.Ext.Array, begin: Double): typingsSlinky.senchaTouch.Ext.Array = js.native
  def slice(array: typingsSlinky.senchaTouch.Ext.Array, begin: Double, end: Double): typingsSlinky.senchaTouch.Ext.Array = js.native
  
  /** [Method] Executes the specified function for each array element until the function returns a truthy value
    * @param array Array
    * @param fn Function Callback function for each item.
    * @param scope Object Callback function scope.
    * @returns Boolean true if the callback function returns a truthy value.
    */
  def some(): Boolean = js.native
  def some(array: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Boolean = js.native
  def some(array: js.UndefOr[scala.Nothing], fn: js.Any): Boolean = js.native
  def some(array: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Boolean = js.native
  def some(array: typingsSlinky.senchaTouch.Ext.Array): Boolean = js.native
  def some(array: typingsSlinky.senchaTouch.Ext.Array, fn: js.UndefOr[scala.Nothing], scope: js.Any): Boolean = js.native
  def some(array: typingsSlinky.senchaTouch.Ext.Array, fn: js.Any): Boolean = js.native
  def some(array: typingsSlinky.senchaTouch.Ext.Array, fn: js.Any, scope: js.Any): Boolean = js.native
  
  /** [Method] Sorts the elements of an Array
    * @param array Array The array to sort.
    * @param sortFn Function The comparison function.
    * @returns Array The sorted array.
    */
  def sort(): typingsSlinky.senchaTouch.Ext.Array = js.native
  def sort(array: js.UndefOr[scala.Nothing], sortFn: js.Any): typingsSlinky.senchaTouch.Ext.Array = js.native
  def sort(array: typingsSlinky.senchaTouch.Ext.Array): typingsSlinky.senchaTouch.Ext.Array = js.native
  def sort(array: typingsSlinky.senchaTouch.Ext.Array, sortFn: js.Any): typingsSlinky.senchaTouch.Ext.Array = js.native
  
  /** [Method] Replaces items in an array
    * @param array Array The Array on which to replace.
    * @param index Number The index in the array at which to operate.
    * @param removeCount Number The number of items to remove at index (can be 0).
    * @returns Array An array containing the removed items.
    */
  def splice(): typingsSlinky.senchaTouch.Ext.Array = js.native
  def splice(array: js.UndefOr[scala.Nothing], index: js.UndefOr[scala.Nothing], removeCount: Double): typingsSlinky.senchaTouch.Ext.Array = js.native
  def splice(array: js.UndefOr[scala.Nothing], index: Double): typingsSlinky.senchaTouch.Ext.Array = js.native
  def splice(array: js.UndefOr[scala.Nothing], index: Double, removeCount: Double): typingsSlinky.senchaTouch.Ext.Array = js.native
  def splice(array: typingsSlinky.senchaTouch.Ext.Array): typingsSlinky.senchaTouch.Ext.Array = js.native
  def splice(array: typingsSlinky.senchaTouch.Ext.Array, index: js.UndefOr[scala.Nothing], removeCount: Double): typingsSlinky.senchaTouch.Ext.Array = js.native
  def splice(array: typingsSlinky.senchaTouch.Ext.Array, index: Double): typingsSlinky.senchaTouch.Ext.Array = js.native
  def splice(array: typingsSlinky.senchaTouch.Ext.Array, index: Double, removeCount: Double): typingsSlinky.senchaTouch.Ext.Array = js.native
  
  /** [Method] Calculates the sum of all items in the given array
    * @param array Array The Array to calculate the sum value of.
    * @returns Number The sum.
    */
  def sum(): Double = js.native
  def sum(array: typingsSlinky.senchaTouch.Ext.Array): Double = js.native
  
  /** [Method] Converts any iterable numeric indices and a length property into a true array
    * @param iterable Object the iterable object to be turned into a true Array.
    * @param start Number a zero-based index that specifies the start of extraction.
    * @param end Number a zero-based index that specifies the end of extraction.
    * @returns Array
    */
  def toArray(): typingsSlinky.senchaTouch.Ext.Array = js.native
  def toArray(iterable: js.UndefOr[scala.Nothing], start: js.UndefOr[scala.Nothing], end: Double): typingsSlinky.senchaTouch.Ext.Array = js.native
  def toArray(iterable: js.UndefOr[scala.Nothing], start: Double): typingsSlinky.senchaTouch.Ext.Array = js.native
  def toArray(iterable: js.UndefOr[scala.Nothing], start: Double, end: Double): typingsSlinky.senchaTouch.Ext.Array = js.native
  def toArray(iterable: js.Any): typingsSlinky.senchaTouch.Ext.Array = js.native
  def toArray(iterable: js.Any, start: js.UndefOr[scala.Nothing], end: Double): typingsSlinky.senchaTouch.Ext.Array = js.native
  def toArray(iterable: js.Any, start: Double): typingsSlinky.senchaTouch.Ext.Array = js.native
  def toArray(iterable: js.Any, start: Double, end: Double): typingsSlinky.senchaTouch.Ext.Array = js.native
  
  /** [Method] Merge multiple arrays into one with unique items
    * @param array1 Array
    * @param array2 Array
    * @param etc Array
    * @returns Array merged
    */
  def union(): typingsSlinky.senchaTouch.Ext.Array = js.native
  def union(
    array1: js.UndefOr[scala.Nothing],
    array2: js.UndefOr[scala.Nothing],
    etc: typingsSlinky.senchaTouch.Ext.Array
  ): typingsSlinky.senchaTouch.Ext.Array = js.native
  def union(array1: js.UndefOr[scala.Nothing], array2: typingsSlinky.senchaTouch.Ext.Array): typingsSlinky.senchaTouch.Ext.Array = js.native
  def union(
    array1: js.UndefOr[scala.Nothing],
    array2: typingsSlinky.senchaTouch.Ext.Array,
    etc: typingsSlinky.senchaTouch.Ext.Array
  ): typingsSlinky.senchaTouch.Ext.Array = js.native
  def union(array1: typingsSlinky.senchaTouch.Ext.Array): typingsSlinky.senchaTouch.Ext.Array = js.native
  def union(
    array1: typingsSlinky.senchaTouch.Ext.Array,
    array2: js.UndefOr[scala.Nothing],
    etc: typingsSlinky.senchaTouch.Ext.Array
  ): typingsSlinky.senchaTouch.Ext.Array = js.native
  def union(array1: typingsSlinky.senchaTouch.Ext.Array, array2: typingsSlinky.senchaTouch.Ext.Array): typingsSlinky.senchaTouch.Ext.Array = js.native
  def union(
    array1: typingsSlinky.senchaTouch.Ext.Array,
    array2: typingsSlinky.senchaTouch.Ext.Array,
    etc: typingsSlinky.senchaTouch.Ext.Array
  ): typingsSlinky.senchaTouch.Ext.Array = js.native
  
  /** [Method] Returns a new array with unique items
    * @param array Array
    * @returns Array results
    */
  def unique(): typingsSlinky.senchaTouch.Ext.Array = js.native
  def unique(array: typingsSlinky.senchaTouch.Ext.Array): typingsSlinky.senchaTouch.Ext.Array = js.native
}
