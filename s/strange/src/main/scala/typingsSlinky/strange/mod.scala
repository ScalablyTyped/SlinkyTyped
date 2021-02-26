package typingsSlinky.strange

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Shortcut
import typingsSlinky.strange.strangeNumbers.`-1`
import typingsSlinky.strange.strangeNumbers.`0`
import typingsSlinky.strange.strangeNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("strange", JSImport.Namespace)
  @js.native
  val ^ : RangeConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("strange", JSImport.Namespace)
  @js.native
  /**
    *
    * @param begin Range's beginning, or left endpoint.
    * @param end Range's end, or right endpoint.
    * @param bounds Range's bounds.
    */
  class Class[T /* <: Endpoint */] ()
    extends typingsSlinky.std.Range {
    def this(begin: T) = this()
    def this(begin: T, end: T) = this()
    def this(begin: js.UndefOr[scala.Nothing], end: T) = this()
    def this(begin: Null, end: T) = this()
    def this(begin: T, end: T, bounds: Bounds) = this()
    def this(begin: T, end: js.UndefOr[scala.Nothing], bounds: Bounds) = this()
    def this(begin: T, end: Null, bounds: Bounds) = this()
    def this(begin: js.UndefOr[scala.Nothing], end: T, bounds: Bounds) = this()
    def this(begin: js.UndefOr[scala.Nothing], end: js.UndefOr[scala.Nothing], bounds: Bounds) = this()
    def this(begin: js.UndefOr[scala.Nothing], end: Null, bounds: Bounds) = this()
    def this(begin: Null, end: T, bounds: Bounds) = this()
    def this(begin: Null, end: js.UndefOr[scala.Nothing], bounds: Bounds) = this()
    def this(begin: Null, end: Null, bounds: Bounds) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.strange.strangeStrings.LeftparenthesisRightparenthesis
    - typingsSlinky.strange.strangeStrings.`[]`
    - typingsSlinky.strange.strangeStrings.`[Rightparenthesis`
    - typingsSlinky.strange.strangeStrings.`Leftparenthesis]`
  */
  trait Bounds extends StObject
  object Bounds {
    
    @scala.inline
    def LeftparenthesisRightparenthesis: typingsSlinky.strange.strangeStrings.LeftparenthesisRightparenthesis = "()".asInstanceOf[typingsSlinky.strange.strangeStrings.LeftparenthesisRightparenthesis]
    
    @scala.inline
    def `Leftparenthesis]`: typingsSlinky.strange.strangeStrings.`Leftparenthesis]` = "(]".asInstanceOf[typingsSlinky.strange.strangeStrings.`Leftparenthesis]`]
    
    @scala.inline
    def `[Rightparenthesis`: typingsSlinky.strange.strangeStrings.`[Rightparenthesis` = "[)".asInstanceOf[typingsSlinky.strange.strangeStrings.`[Rightparenthesis`]
    
    @scala.inline
    def `[]`: typingsSlinky.strange.strangeStrings.`[]` = "[]".asInstanceOf[typingsSlinky.strange.strangeStrings.`[]`]
  }
  
  type Endpoint = js.Date | Double | String
  
  @js.native
  trait Range[T /* <: Endpoint */] extends StObject {
    
    /**
      * Range's beginning, or left endpoint.
      */
    var begin: js.UndefOr[T | Null] = js.native
    
    /**
      * Range's bounds.
      *
      * Bounds signify whether the range includes or excludes that particular
      * endpoint.
      *
      * Pair | Meaning
      * -----|--------
      * `()` | open
      * `[]` | closed
      * `[)` | left-closed, right-open
      * `(]` | left-open, right-closed
      *
      * @example
      * new Range(1, 5).bounds // => "[]"
      * new Range(1, 5, "[)").bounds // => "[)"
      */
    var bounds: Bounds = js.native
    
    /**
      * Compares this range's beginning with the given value.
      * Returns `-1` if this range begins before the given value, `0` if they're
      * equal and `1` if this range begins after the given value.
      *
      * `null` is considered to signify negative infinity for non-numeric range
      * endpoints.
      *
      * @example
      * new Range(0, 10).compareBegin(5) // => -1
      * new Range(0, 10).compareBegin(0) // => 0
      * new Range(5, 10).compareBegin(0) // => 1
      * new Range(5, 10).compareBegin(null) // => 1
      */
    def compareBegin(): `-1` | `0` = js.native
    def compareBegin(begin: T): `-1` | `0` = js.native
    
    /**
      * Compares this range's end with the given value.
      * Returns `-1` if this range ends before the given value, `0` if they're
      * equal and `1` if this range ends after the given value.
      *
      * `null` is considered to signify positive infinity for non-numeric range
      * endpoints.
      *
      * @example
      * new Range(0, 10).compareEnd(5) // => -1
      * new Range(0, 10).compareEnd(10) // => 0
      * new Range(0, 5).compareEnd(10) // => 1
      * new Range(0, 5).compareEnd(null) // => -1
      */
    def compareEnd(): `-1` | `0` = js.native
    def compareEnd(end: T): `-1` | `0` = js.native
    
    /**
      * Check if a given value is contained within this range.
      * Returns `true` or `false`.
      *
      * @example
      * new Range(0, 10).contains(5) // => true
      * new Range(0, 10).contains(10) // => true
      * new Range(0, 10, "[)").contains(10) // => false
      */
    def contains(): Boolean = js.native
    def contains(value: T): Boolean = js.native
    
    /**
      * Range's end, or right endpoint.
      */
    var end: js.UndefOr[T | Null] = js.native
    
    /**
      * @alias toJSON
      */
    def inspect(): String = js.native
    
    /**
      * Check if this range intersects with another.
      * Returns `true` or `false`.
      *
      * Ranges that have common points intersect. Ranges that are consecutive and
      * with *inclusive* endpoints are also intersecting. An empty range will never
      * intersect.
      *
      * @example
      * new Range(0, 10).intersects(new Range(5, 7)) // => true
      * new Range(0, 10).intersects(new Range(10, 20)) // => true
      * new Range(0, 10, "[)").intersects(new Range(10, 20)) // => false
      * new Range(0, 10).intersects(new Range(20, 30)) // => false
      */
    def intersects(value: Range[T]): Boolean = js.native
    
    /**
      * Check whether the range is bounded.
      * A bounded range is one where neither endpoint is `null` or `Infinity`. An
      * empty range is considered bounded.
      *
      * @example
      * new Range().isBounded() // => true
      * new Range(5, 5).isBounded() // => true
      * new Range(null, new Date(2000, 5, 18)).isBounded() // => false
      * new Range(0, Infinity).isBounded() // => false
      * new Range(-Infinity, Infinity).isBounded() // => false
      */
    def isBounded(): Boolean = js.native
    
    /**
      * Check whether the range is empty.
      * An empty range is one where either of the endpoints is `undefined`
      * (like `new Range`) or a range with two equivalent, but exculsive endpoints
      * (`new Range(5, 5, "[)")`).
      *
      * Equivalence is checked by using the `<` operators, so value objects will be
      * coerced into something comparable by JavaScript. That usually means calling
      * the object's `valueOf` function.
      *
      * @example
      * new Range().isEmpty() // => true
      * new Range(5, 5, "[)").isEmpty() // => true
      * new Range(1, 10).isEmpty() // => false
      */
    def isEmpty(): Boolean = js.native
    
    /**
      * @alias isBounded
      */
    def isFinite(): Boolean = js.native
    
    /**
      * @alias isUnbounded
      */
    def isInfinite(): Boolean = js.native
    
    /**
      * Check whether the range is unbounded.
      * An unbounded range is one where either endpoint is `null` or `Infinity`. An
      * empty range is not considered unbounded.
      *
      * @example
      * new Range().isUnbounded() // => false
      * new Range(5, 5).isUnbounded() // => false
      * new Range(null, new Date(2000, 5, 18)).isUnbounded() // => true
      * new Range(0, Infinity).isUnbounded() // => true
      * new Range(-Infinity, Infinity).isUnbounded() // => true
      */
    def isUnbounded(): Boolean = js.native
    
    /**
      * Stringifies the range when passing it to `JSON.stringify`.
      * This way you don't need to manually call `toString` when stringifying.
      *
      * @example
      * JSON.stringify(new Range(1, 10)) // "\"[1,10]\""
      *
      * @alias toString
      */
    def toJSON(): String = js.native
  }
  
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
          js.UndefOr[(/* begin */ Endpoint) | (/* begin */ Null)], 
          /* end */ Endpoint, 
          org.scalajs.dom.raw.Range
        ]
       with Instantiable3[
          js.UndefOr[(/* begin */ Endpoint) | (/* begin */ Null)], 
          js.UndefOr[(/* end */ Endpoint) | (/* end */ Null)], 
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
    def apply[T /* <: Endpoint */](begin: T, end: js.UndefOr[scala.Nothing], bounds: Bounds): org.scalajs.dom.raw.Range = js.native
    def apply[T /* <: Endpoint */](begin: T, end: Null, bounds: Bounds): org.scalajs.dom.raw.Range = js.native
    def apply[T /* <: Endpoint */](begin: js.UndefOr[scala.Nothing], end: T): org.scalajs.dom.raw.Range = js.native
    def apply[T /* <: Endpoint */](begin: js.UndefOr[scala.Nothing], end: T, bounds: Bounds): org.scalajs.dom.raw.Range = js.native
    def apply[T /* <: Endpoint */](begin: js.UndefOr[scala.Nothing], end: js.UndefOr[scala.Nothing], bounds: Bounds): org.scalajs.dom.raw.Range = js.native
    def apply[T /* <: Endpoint */](begin: js.UndefOr[scala.Nothing], end: Null, bounds: Bounds): org.scalajs.dom.raw.Range = js.native
    def apply[T /* <: Endpoint */](begin: Null, end: T): org.scalajs.dom.raw.Range = js.native
    def apply[T /* <: Endpoint */](begin: Null, end: T, bounds: Bounds): org.scalajs.dom.raw.Range = js.native
    def apply[T /* <: Endpoint */](begin: Null, end: js.UndefOr[scala.Nothing], bounds: Bounds): org.scalajs.dom.raw.Range = js.native
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
  
  type _To = RangeConstructor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: RangeConstructor = ^
}
