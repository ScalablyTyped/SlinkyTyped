package typingsSlinky.storybookReactNative.components

import typingsSlinky.emotionStyledBase.anon.`0`
import typingsSlinky.emotionStyledBase.emotionStyledBaseStrings.theme
import typingsSlinky.emotionStyledBase.helperMod.Omit
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactNative.mod.Text
import typingsSlinky.reactNative.mod.TextProps
import typingsSlinky.storybookReactNative.anon.BackgroundColor
import typingsSlinky.storybookReactNative.anon.Selected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Name {
  @JSImport("@storybook/react-native/dist/preview/components/Shared/text", "Name")
  @js.native
  object component extends js.Object
  
  def withProps(
    p: PropsWithChildren[
      TextProps with RefAttributes[Text] with (Omit[Selected, theme]) with `0`[BackgroundColor]
    ]
  ): SharedBuilder_PropsWithChildren1194439799[Text] = new SharedBuilder_PropsWithChildren1194439799[Text](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(selected: Boolean): SharedBuilder_PropsWithChildren1194439799[Text] = {
    val __props = js.Dynamic.literal(selected = selected.asInstanceOf[js.Any])
    new SharedBuilder_PropsWithChildren1194439799[Text](js.Array(this.component, __props.asInstanceOf[PropsWithChildren[
      TextProps with RefAttributes[Text] with (Omit[Selected, theme]) with `0`[BackgroundColor]
    ]]))
  }
}

