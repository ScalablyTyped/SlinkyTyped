package typingsSlinky.storybookUi

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import typingsSlinky.emotionStyledBase.mod.StyledComponent
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.storybookAddons.distMod.Collection
import typingsSlinky.storybookTheming.typesMod.Theme
import typingsSlinky.storybookUi.anon.PickDetailedHTMLPropsHTML
import typingsSlinky.storybookUi.providerMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fakeProviderMod {
  
  @JSImport("@storybook/ui/dist/FakeProvider", "Centered")
  @js.native
  val Centered: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
    PickDetailedHTMLPropsHTML, 
    Theme
  ] = js.native
  
  @JSImport("@storybook/ui/dist/FakeProvider", "FakeProvider")
  @js.native
  class FakeProvider () extends default {
    
    def getElements(`type`: js.Any): Collection = js.native
    
    def renderPreview(): ReactElement = js.native
  }
  
  @JSImport("@storybook/ui/dist/FakeProvider", "PrettyFakeProvider")
  @js.native
  class PrettyFakeProvider () extends FakeProvider {
    
    def renderPreview(args: js.Any*): ReactElement = js.native
  }
}
