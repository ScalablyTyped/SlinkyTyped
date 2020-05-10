package typingsSlinky.storybookAddons.makeDecoratorMod

import typingsSlinky.storybookAddons.typesMod.StoryContext
import typingsSlinky.storybookAddons.typesMod.StoryGetter
import typingsSlinky.storybookAddons.typesMod.StoryWrapper
import typingsSlinky.storybookAddons.typesMod.WrapperSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MakeDecoratorOptions extends js.Object {
  var allowDeprecatedUsage: js.UndefOr[Boolean] = js.native
  var name: String = js.native
  var parameterName: String = js.native
  var skipIfNoParametersOrOptions: js.UndefOr[Boolean] = js.native
  var wrapper: StoryWrapper = js.native
}

object MakeDecoratorOptions {
  @scala.inline
  def apply(
    name: String,
    parameterName: String,
    wrapper: (/* getStory */ StoryGetter, /* context */ StoryContext, /* settings */ WrapperSettings) => js.Any
  ): MakeDecoratorOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parameterName = parameterName.asInstanceOf[js.Any], wrapper = js.Any.fromFunction3(wrapper))
    __obj.asInstanceOf[MakeDecoratorOptions]
  }
  @scala.inline
  implicit class MakeDecoratorOptionsOps[Self <: MakeDecoratorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParameterName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrapper(
      value: (/* getStory */ StoryGetter, /* context */ StoryContext, /* settings */ WrapperSettings) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withAllowDeprecatedUsage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDeprecatedUsage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDeprecatedUsage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDeprecatedUsage")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipIfNoParametersOrOptions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipIfNoParametersOrOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipIfNoParametersOrOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipIfNoParametersOrOptions")(js.undefined)
        ret
    }
  }
  
}

