package typingsSlinky.uirouterCore.viewInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveUIView extends js.Object {
  /** type of framework, e.g., "ng1" or "ng2" */
  @JSName("$type")
  var $type: String = js.native
  /** The ViewConfig that is currently loaded into the ui-view */
  var config: ViewConfig = js.native
  /** The state context in which the ui-view tag was created. */
  var creationContext: ViewContext = js.native
  /** The ui-view's fully qualified name */
  var fqn: String = js.native
  /** An auto-incremented id */
  var id: Double = js.native
  /** The ui-view short name */
  var name: String = js.native
  /** A callback that should apply a ViewConfig (or clear the ui-view, if config is undefined) */
  def configUpdated(config: ViewConfig): Unit = js.native
}

object ActiveUIView {
  @scala.inline
  def apply(
    $type: String,
    config: ViewConfig,
    configUpdated: ViewConfig => Unit,
    creationContext: ViewContext,
    fqn: String,
    id: Double,
    name: String
  ): ActiveUIView = {
    val __obj = js.Dynamic.literal($type = $type.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], configUpdated = js.Any.fromFunction1(configUpdated), creationContext = creationContext.asInstanceOf[js.Any], fqn = fqn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveUIView]
  }
  @scala.inline
  implicit class ActiveUIViewOps[Self <: ActiveUIView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfig(value: ViewConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigUpdated(value: ViewConfig => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configUpdated")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreationContext(value: ViewContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFqn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fqn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

