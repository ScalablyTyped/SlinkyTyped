package typingsSlinky.uirouterCore.stateInterfaceMod

import typingsSlinky.uirouterCore.viewInterfaceMod.ViewContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewDeclaration extends js.Object {
  /**
    * The context that this view is declared within.
    * @internalapi
    */
  @JSName("$context")
  var $context: js.UndefOr[ViewContext] = js.native
  /**
    * The raw name for the view declaration, i.e., the [[StateDeclaration.views]] property name.
    * @internalapi
    */
  @JSName("$name")
  var $name: js.UndefOr[String] = js.native
  /**
    * A type identifier for the View
    *
    * This is used when loading prerequisites for the view, before it enters the DOM.  Different types of views
    * may load differently (e.g., templateProvider+controllerProvider vs component class)
    * @internalapi
    */
  @JSName("$type")
  var $type: js.UndefOr[String] = js.native
  /**
    * The normalized context anchor (state name) for the `uiViewName`
    *
    * When targeting a `ui-view`, the `uiViewName` address is anchored to a context name (state name).
    * @internalapi
    */
  @JSName("$uiViewContextAnchor")
  var $uiViewContextAnchor: js.UndefOr[String] = js.native
  /**
    * The normalized address for the `ui-view` which this ViewConfig targets.
    *
    * A ViewConfig targets a `ui-view` in the DOM (relative to the `uiViewContextAnchor`) which has
    * a specific name.
    * @example `header` or `$default`
    *
    * The `uiViewName` can also target a _nested view_ by providing a dot-notation address
    * @example `foo.bar` or `foo.$default.bar`
    * @internalapi
    */
  @JSName("$uiViewName")
  var $uiViewName: js.UndefOr[String] = js.native
}

object ViewDeclaration {
  @scala.inline
  def apply(): ViewDeclaration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewDeclaration]
  }
  @scala.inline
  implicit class ViewDeclarationOps[Self <: ViewDeclaration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$context(value: ViewContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$context: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$context")(js.undefined)
        ret
    }
    @scala.inline
    def with$name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$name")(js.undefined)
        ret
    }
    @scala.inline
    def with$type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$type")(js.undefined)
        ret
    }
    @scala.inline
    def with$uiViewContextAnchor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$uiViewContextAnchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$uiViewContextAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$uiViewContextAnchor")(js.undefined)
        ret
    }
    @scala.inline
    def with$uiViewName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$uiViewName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$uiViewName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$uiViewName")(js.undefined)
        ret
    }
  }
  
}

