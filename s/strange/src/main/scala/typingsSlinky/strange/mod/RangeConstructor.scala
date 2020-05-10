package typingsSlinky.strange.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.strange.strangeNumbers.`-1`
import typingsSlinky.strange.strangeNumbers.`0`
import typingsSlinky.strange.strangeNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangeConstructor
  extends /**
  *
  * @param begin Range's beginning, or left endpoint.
  * @param end Range's end, or right endpoint.
  * @param bounds Range's bounds.
  */
Instantiable0[org.scalajs.dom.raw.Range]
     with Instantiable1[/* begin */ Endpoint, org.scalajs.dom.raw.Range]
     with Instantiable2[
      (/* begin */ Endpoint) | (/* begin */ Null), 
      /* end */ Endpoint, 
      org.scalajs.dom.raw.Range
    ]
     with Instantiable3[
      (/* begin */ Endpoint) | (/* begin */ Null), 
      (/* end */ Endpoint) | (/* end */ Null), 
      /* bounds */ Bounds, 
      org.scalajs.dom.raw.Range
    ] {
  /**
    *
    * @param begin Range's beginning, or left endpoint.
    * @param end Range's end, or right endpoint.
    * @param bounds Range's bounds.
    */
  def apply[T /* <: Endpoint */](): org.scalajs.dom.raw.Range = js.native
  def apply[T /* <: Endpoint */](begin: T): org.scalajs.dom.raw.Range = js.native
  def apply[T /* <: Endpoint */](begin: T, end: T): org.scalajs.dom.raw.Range = js.native
  def apply[T /* <: Endpoint */](begin: T, end: T, bounds: Bounds): org.scalajs.dom.raw.Range = js.native
  def apply[T /* <: Endpoint */](begin: T, end: Null, bounds: Bounds): org.scalajs.dom.raw.Range = js.native
  def apply[T /* <: Endpoint */](begin: Null, end: T): org.scalajs.dom.raw.Range = js.native
  def apply[T /* <: Endpoint */](begin: Null, end: T, bounds: Bounds): org.scalajs.dom.raw.Range = js.native
  def apply[T /* <: Endpoint */](begin: Null, end: Null, bounds: Bounds): org.scalajs.dom.raw.Range = js.native
  /**
    * Compares two range's beginnings.
    * Returns `-1` if `a` begins before `b` begins, `0` if they're equal and `1`
    * if `a` begins after `b`.
    *
    * @example
    * Range.compareBeginToBegin(new Range(0, 10), new Range(5, 15)) // => -1
    * Range.compareBeginToBegin(new Range(0, 10), new Range(0, 15)) // => 0
    * Range.compareBeginToBegin(new Range(0, 10), new Range(0, 15, "()")) // => 1
    */
  def compareBeginToBegin[U /* <: Endpoint */](a: org.scalajs.dom.raw.Range, b: org.scalajs.dom.raw.Range): `-1` | `0` | `1` = js.native
  /**
    * Compares the first range's beginning to the second's end.
    * Returns `<0` if `a` begins before `b` ends, `0` if one starts where the other
    * ends and `>1` if `a` begins after `b` ends.
    *
    * @example
    * Range.compareBeginToEnd(new Range(0, 10), new Range(0, 5)) // => -1
    * Range.compareBeginToEnd(new Range(0, 10), new Range(-10, 0)) // => 0
    * Range.compareBeginToEnd(new Range(0, 10), new Range(-10, -5)) // => 1
    */
  def compareBeginToEnd[U /* <: Endpoint */](a: org.scalajs.dom.raw.Range, b: org.scalajs.dom.raw.Range): `-1` | `0` | `1` = js.native
  /**
    * Compares two range's endings.
    * Returns `-1` if `a` ends before `b` ends, `0` if they're equal and `1`
    * if `a` ends after `b`.
    *
    * @example
    * Range.compareEndToEnd(new Range(0, 10), new Range(5, 15)) // => -1
    * Range.compareEndToEnd(new Range(0, 10), new Range(5, 10)) // => 0
    * Range.compareEndToEnd(new Range(0, 10), new Range(5, 10, "()")) // => 1
    */
  def compareEndToEnd[U /* <: Endpoint */](a: org.scalajs.dom.raw.Range, b: org.scalajs.dom.raw.Range): `-1` | `0` | `1` = js.native
  /**
    * Parses a string stringified by
    * [`Range.prototype.toString`](#Range.prototype.toString).
    *
    * To have it also parse the endpoints to something other than a string, pass
    * a function as the second argument.
    *
    * If you pass `Number` as the _parse_ function and the endpoints are
    * unbounded, they'll be set to `Infinity` for easier computation.
    *
    * @example
    * Range.parse("[a,z)") // => new Range("a", "z", "[)")
    */
  def parse(range: String): org.scalajs.dom.raw.Range = js.native
  /**
    * Parses a string stringified by
    * [`Range.prototype.toString`](#Range.prototype.toString).
    *
    * To have it also parse the endpoints to something other than a string, pass
    * a function as the second argument.
    *
    * If you pass `Number` as the _parse_ function and the endpoints are
    * unbounded, they'll be set to `Infinity` for easier computation.
    *
    * @example
    * Range.parse("[42,69]", Number) // => new Range(42, 69)
    * Range.parse("[15,]", Number) // => new Range(15, Infinity)
    * Range.parse("(,3.14]", Number) // => new Range(-Infinity, 3.14, "(]")
    */
  def parse[U /* <: Endpoint */](range: String, parse: js.Function1[/* endpoint */ String, U]): org.scalajs.dom.raw.Range = js.native
  /**
    * Merges two ranges and returns a range that encompasses both of them.
    * The ranges don't have to be intersecting.
    *
    * @example
    * Range.union(new Range(0, 5), new Range(5, 10)) // => new Range(0, 10)
    * Range.union(new Range(0, 10), new Range(5, 15)) // => new Range(0, 15)
    *
    * var a = new Range(-5, 0, "()")
    * var b = new Range(5, 10)
    * Range.union(a, b) // => new Range(-5, 10, "(]")
    */
  def union[U /* <: Endpoint */](a: org.scalajs.dom.raw.Range, b: org.scalajs.dom.raw.Range): org.scalajs.dom.raw.Range = js.native
}

