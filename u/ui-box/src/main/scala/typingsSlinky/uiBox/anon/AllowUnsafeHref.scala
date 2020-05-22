package typingsSlinky.uiBox.anon

import typingsSlinky.react.mod.Ref
import typingsSlinky.uiBox.boxTypesMod.Is
import typingsSlinky.uiBox.boxTypesMod.RefType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllowUnsafeHref[T /* <: Is[_] */] extends js.Object {
  /**
    * Allows the high level value of safeHref to be overwritten on an individual component basis
    */
  var allowUnsafeHref: js.UndefOr[Boolean] = js.undefined
  /**
    * Callback that gets passed a ref to inner DOM node (or component if the
    * `is` prop is set to a React component type).
    */
  var innerRef: js.UndefOr[Ref[RefType[T]]] = js.undefined
  /**
    * Replaces the underlying element
    */
  var is: js.UndefOr[T] = js.undefined
}

object AllowUnsafeHref {
  @scala.inline
  def apply[T](
    allowUnsafeHref: js.UndefOr[Boolean] = js.undefined,
    innerRef: js.UndefOr[Null | Ref[RefType[T]]] = js.undefined,
    is: T = null
  ): AllowUnsafeHref[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowUnsafeHref)) __obj.updateDynamic("allowUnsafeHref")(allowUnsafeHref.get.asInstanceOf[js.Any])
    if (!js.isUndefined(innerRef)) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowUnsafeHref[T]]
  }
}

