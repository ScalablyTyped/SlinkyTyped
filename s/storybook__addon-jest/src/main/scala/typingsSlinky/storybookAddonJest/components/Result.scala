package typingsSlinky.storybookAddonJest.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.storybookAddonJest.resultMod.ResultProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Result {
  @JSImport("@storybook/addon-jest/dist/components/Result", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def fullName(value: String): this.type = set("fullName", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ResultProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(failureMessages: js.Any, status: String): Builder = {
    val __props = js.Dynamic.literal(failureMessages = failureMessages.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ResultProps]))
  }
}

