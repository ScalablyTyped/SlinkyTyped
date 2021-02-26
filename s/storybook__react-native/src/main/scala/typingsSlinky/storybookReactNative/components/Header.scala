package typingsSlinky.storybookReactNative.components

import typingsSlinky.emotionStyledBase.anon.`0`
import typingsSlinky.emotionStyledBase.emotionStyledBaseStrings.theme
import typingsSlinky.emotionStyledBase.helperMod.Omit
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactNative.mod.Text
import typingsSlinky.reactNative.mod.TextProps
import typingsSlinky.storybookReactNative.anon.BackgroundColor
import typingsSlinky.storybookReactNative.anon.Selected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Header {
  
  @scala.inline
  def apply(selected: Boolean): SharedBuilder_TextPropsRefAttributesOmit0562583920[Text] = {
    val __props = js.Dynamic.literal(selected = selected.asInstanceOf[js.Any])
    new SharedBuilder_TextPropsRefAttributesOmit0562583920[Text](js.Array(this.component, __props.asInstanceOf[TextProps with RefAttributes[Text] with (Omit[Selected, theme]) with `0`[BackgroundColor]]))
  }
  
  @JSImport("@storybook/react-native/dist/preview/components/Shared/text", "Header")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: TextProps with RefAttributes[Text] with (Omit[Selected, theme]) with `0`[BackgroundColor]): SharedBuilder_TextPropsRefAttributesOmit0562583920[Text] = new SharedBuilder_TextPropsRefAttributesOmit0562583920[Text](js.Array(this.component, p.asInstanceOf[js.Any]))
}
