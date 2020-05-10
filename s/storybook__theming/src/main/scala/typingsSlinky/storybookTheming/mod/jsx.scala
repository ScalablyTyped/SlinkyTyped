package typingsSlinky.storybookTheming.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Attributes
import typingsSlinky.react.mod.CElement
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.react.mod.ClassType
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.DOMAttributes
import typingsSlinky.react.mod.DetailedReactHTMLElement
import typingsSlinky.react.mod.FunctionComponent
import typingsSlinky.react.mod.FunctionComponentElement
import typingsSlinky.react.mod.InputHTMLAttributes
import typingsSlinky.react.mod.ReactSVGElement
import typingsSlinky.react.mod.SVGAttributes
import typingsSlinky.storybookTheming.storybookThemingStrings.input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/theming", "jsx")
@js.native
object jsx extends js.Object {
  def apply(`type`: input): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = js.native
  def apply(`type`: input, children: TagMod[Any]*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = js.native
  def apply(
    `type`: input,
    props: InputHTMLAttributes[HTMLInputElement] with ClassAttributes[HTMLInputElement],
    children: TagMod[Any]*
  ): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = js.native
  def apply[P /* <: js.Object */](`type`: String): ReactElement = js.native
  def apply[P /* <: js.Object */](`type`: String, children: TagMod[Any]*): ReactElement = js.native
  def apply[P /* <: js.Object */](`type`: String, props: Attributes with P, children: TagMod[Any]*): ReactElement = js.native
  def apply[P /* <: js.Object */](`type`: ClassType[P, ReactComponentClass[P], ReactComponentClass[P]]): CElement[P, ReactComponentClass[P]] = js.native
  def apply[P /* <: js.Object */](`type`: ClassType[P, ReactComponentClass[P], ReactComponentClass[P]], children: TagMod[Any]*): CElement[P, ReactComponentClass[P]] = js.native
  def apply[P /* <: js.Object */](
    `type`: ClassType[P, ReactComponentClass[P], ReactComponentClass[P]],
    props: ClassAttributes[ReactComponentClass[P]] with P,
    children: TagMod[Any]*
  ): CElement[P, ReactComponentClass[P]] = js.native
  def apply[P /* <: js.Object */](`type`: ComponentClass[P, js.Object]): ReactElement = js.native
  def apply[P /* <: js.Object */](`type`: ComponentClass[P, js.Object], children: TagMod[Any]*): ReactElement = js.native
  def apply[P /* <: js.Object */](`type`: ComponentClass[P, js.Object], props: Attributes with P, children: TagMod[Any]*): ReactElement = js.native
  def apply[P /* <: js.Object */](`type`: FunctionComponent[P]): FunctionComponentElement[P] = js.native
  def apply[P /* <: js.Object */](`type`: FunctionComponent[P], children: TagMod[Any]*): FunctionComponentElement[P] = js.native
  def apply[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes with P, children: TagMod[Any]*): FunctionComponentElement[P] = js.native
  def apply[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: ClassAttributes[T] with P, children: TagMod[Any]*): ReactElement = js.native
  def apply[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](`type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any): ReactSVGElement = js.native
  def apply[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
    children: TagMod[Any]*
  ): ReactSVGElement = js.native
  def apply[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
    props: ClassAttributes[T] with P,
    children: TagMod[Any]*
  ): ReactSVGElement = js.native
  def apply[P /* <: js.Object */, T /* <: ReactComponentClass[P] */, C /* <: ReactComponentClass[P] */](`type`: ClassType[P, T, C]): CElement[P, T] = js.native
  def apply[P /* <: js.Object */, T /* <: ReactComponentClass[P] */, C /* <: ReactComponentClass[P] */](`type`: ClassType[P, T, C], children: TagMod[Any]*): CElement[P, T] = js.native
  def apply[P /* <: js.Object */, T /* <: ReactComponentClass[P] */, C /* <: ReactComponentClass[P] */](`type`: ClassType[P, T, C], props: ClassAttributes[T] with P, children: TagMod[Any]*): CElement[P, T] = js.native
}

