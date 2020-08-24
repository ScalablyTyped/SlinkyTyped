package typingsSlinky.storybookTheming.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.emotionUtils.mod.EmotionCache
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/theming", "withEmotionCache")
@js.native
object withEmotionCache extends js.Object {
  def apply[Props, RefType](
    func: js.Function3[/* props */ Props, /* context */ EmotionCache, /* ref */ Ref[RefType], ReactElement]
  ): ReactComponentClass[Props with ClassAttributes[RefType]] = js.native
}

