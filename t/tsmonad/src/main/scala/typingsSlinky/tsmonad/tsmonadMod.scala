package typingsSlinky.tsmonad

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.tsmonad.libSrcEitherMod.EitherType
import typingsSlinky.tsmonad.libSrcMaybeMod.MaybeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsmonad", JSImport.Namespace)
@js.native
object tsmonadMod extends js.Object {
  @js.native
  class Either[L, R] protected ()
    extends typingsSlinky.tsmonad.libSrcEitherMod.Either[L, R] {
    def this(`type`: EitherType) = this()
    def this(`type`: EitherType, l: L) = this()
    def this(`type`: EitherType, l: L, r: R) = this()
  }
  
  @js.native
  class Maybe[T] protected ()
    extends typingsSlinky.tsmonad.libSrcMaybeMod.Maybe[T] {
    def this(`type`: MaybeType) = this()
    def this(`type`: MaybeType, value: T) = this()
  }
  
  @js.native
  class Writer[S, T] protected ()
    extends typingsSlinky.tsmonad.libSrcWriterMod.Writer[S, T] {
    def this(story: js.Array[S], value: T) = this()
  }
  
  def either[L, R](): typingsSlinky.tsmonad.libSrcEitherMod.Either[L, R] = js.native
  def either[L, R](l: L): typingsSlinky.tsmonad.libSrcEitherMod.Either[L, R] = js.native
  def either[L, R](l: L, r: R): typingsSlinky.tsmonad.libSrcEitherMod.Either[L, R] = js.native
  def eq(a: js.Any, b: js.Any): js.Any = js.native
  def maybe[T](t: T): typingsSlinky.tsmonad.libSrcMaybeMod.Maybe[T] = js.native
  def writer[S, T](story: js.Array[S], value: T): typingsSlinky.tsmonad.libSrcWriterMod.Writer[S, T] = js.native
  /* static members */
  @js.native
  object Either extends js.Object {
    def left[L, R](l: L): typingsSlinky.tsmonad.libSrcEitherMod.Either[L, R] = js.native
    def right[L, R](r: R): typingsSlinky.tsmonad.libSrcEitherMod.Either[L, R] = js.native
  }
  
  @js.native
  object EitherType extends js.Object {
    /* 0 */ val Left: typingsSlinky.tsmonad.libSrcEitherMod.EitherType.Left with Double = js.native
    /* 1 */ val Right: typingsSlinky.tsmonad.libSrcEitherMod.EitherType.Right with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.tsmonad.libSrcEitherMod.EitherType with Double] = js.native
  }
  
  /* static members */
  @js.native
  object Maybe extends js.Object {
    def all(t: StringDictionary[typingsSlinky.tsmonad.libSrcMaybeMod.Maybe[_]]): typingsSlinky.tsmonad.libSrcMaybeMod.Maybe[StringDictionary[_]] = js.native
    def isJust[T](t: typingsSlinky.tsmonad.libSrcMaybeMod.Maybe[T]): Boolean = js.native
    def isNothing[T](t: typingsSlinky.tsmonad.libSrcMaybeMod.Maybe[T]): Boolean = js.native
    def just[T](t: T): typingsSlinky.tsmonad.libSrcMaybeMod.Maybe[T] = js.native
    def maybe[T](): typingsSlinky.tsmonad.libSrcMaybeMod.Maybe[T] = js.native
    def maybe[T](t: T): typingsSlinky.tsmonad.libSrcMaybeMod.Maybe[T] = js.native
    def nothing[T](): typingsSlinky.tsmonad.libSrcMaybeMod.Maybe[T] = js.native
    def sequence[T](t: StringDictionary[typingsSlinky.tsmonad.libSrcMaybeMod.Maybe[T]]): typingsSlinky.tsmonad.libSrcMaybeMod.Maybe[StringDictionary[T]] = js.native
  }
  
  @js.native
  object MaybeType extends js.Object {
    /* 1 */ val Just: typingsSlinky.tsmonad.libSrcMaybeMod.MaybeType.Just with Double = js.native
    /* 0 */ val Nothing: typingsSlinky.tsmonad.libSrcMaybeMod.MaybeType.Nothing with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.tsmonad.libSrcMaybeMod.MaybeType with Double] = js.native
  }
  
  /* static members */
  @js.native
  object Writer extends js.Object {
    def tell[S](s: S): typingsSlinky.tsmonad.libSrcWriterMod.Writer[S, Double] = js.native
    def writer[S, T](story: js.Array[S], value: T): typingsSlinky.tsmonad.libSrcWriterMod.Writer[S, T] = js.native
  }
  
}

