package typingsSlinky.semanticUiReact.sidebarSidebarMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`scale down`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`slide along`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`slide out`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`very thin`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`very wide`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.bottom
import typingsSlinky.semanticUiReact.semanticUiReactStrings.left
import typingsSlinky.semanticUiReact.semanticUiReactStrings.overlay
import typingsSlinky.semanticUiReact.semanticUiReactStrings.push
import typingsSlinky.semanticUiReact.semanticUiReactStrings.right
import typingsSlinky.semanticUiReact.semanticUiReactStrings.thin
import typingsSlinky.semanticUiReact.semanticUiReactStrings.top
import typingsSlinky.semanticUiReact.semanticUiReactStrings.uncover
import typingsSlinky.semanticUiReact.semanticUiReactStrings.wide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictSidebarProps extends js.Object {
  /** Animation style. */
  var animation: js.UndefOr[overlay | push | (`scale down`) | uncover | (`slide out`) | (`slide along`)] = js.undefined
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[ReactElement] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.undefined
  /** Direction the sidebar should appear on. */
  var direction: js.UndefOr[top | right | bottom | left] = js.undefined
  /**
    * Called after a sidebar has finished animating out.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onHidden: js.UndefOr[
    js.Function2[/* event */ SyntheticMouseEvent[HTMLElement], /* data */ SidebarProps, Unit]
  ] = js.undefined
  /**
    * Called before a sidebar begins to animate out.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onHide: js.UndefOr[
    js.Function2[/* event */ SyntheticMouseEvent[HTMLElement], /* data */ SidebarProps, Unit]
  ] = js.undefined
  /**
    * Called when a sidebar has finished animating in.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onShow: js.UndefOr[
    js.Function2[/* event */ SyntheticMouseEvent[HTMLElement], /* data */ SidebarProps, Unit]
  ] = js.undefined
  /**
    * Called when a sidebar begins animating in.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onVisible: js.UndefOr[
    js.Function2[/* event */ SyntheticMouseEvent[HTMLElement], /* data */ SidebarProps, Unit]
  ] = js.undefined
  /** A sidebar can handle clicks on the passed element. */
  var target: js.UndefOr[js.Object | ReactRef[HTMLElement]] = js.undefined
  /** Controls whether or not the sidebar is visible on the page. */
  var visible: js.UndefOr[Boolean] = js.undefined
  /** Sidebar width. */
  var width: js.UndefOr[(`very thin`) | thin | wide | (`very wide`)] = js.undefined
}

object StrictSidebarProps {
  @scala.inline
  def apply(): StrictSidebarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictSidebarProps]
  }
  @scala.inline
  implicit class StrictSidebarPropsOps[Self <: StrictSidebarProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnimation(value: overlay | push | (`scale down`) | uncover | (`slide out`) | (`slide along`)): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setAs(value: js.Any): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setContentReactElement(value: ReactElement): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setContent(value: SemanticShorthandContent): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setDirection(value: top | right | bottom | left): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setOnHidden(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ SidebarProps) => Unit): Self = this.set("onHidden", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnHidden: Self = this.set("onHidden", js.undefined)
    @scala.inline
    def setOnHide(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ SidebarProps) => Unit): Self = this.set("onHide", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnHide: Self = this.set("onHide", js.undefined)
    @scala.inline
    def setOnShow(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ SidebarProps) => Unit): Self = this.set("onShow", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    @scala.inline
    def setOnVisible(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ SidebarProps) => Unit): Self = this.set("onVisible", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnVisible: Self = this.set("onVisible", js.undefined)
    @scala.inline
    def setTargetRefObject(value: ReactRef[HTMLElement]): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: js.Object | ReactRef[HTMLElement]): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setWidth(value: (`very thin`) | thin | wide | (`very wide`)): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

