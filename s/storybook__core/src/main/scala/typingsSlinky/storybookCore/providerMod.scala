package typingsSlinky.storybookCore

import typingsSlinky.storybookAddons.distMod.Collection
import typingsSlinky.storybookAddons.distMod.Config
import typingsSlinky.storybookAddons.typesMod.Types_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providerMod {
  
  @JSImport("@storybook/core/dist/client/manager/provider", JSImport.Default)
  @js.native
  class default () extends ReactProvider
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Provider * / any */ @js.native
  trait ReactProvider extends StObject {
    
    var addons: js.Any = js.native
    
    var channel: js.Any = js.native
    
    def getConfig(): Config = js.native
    
    def getElements(`type`: Types_): Collection = js.native
    
    def handleAPI(api: js.Any): Unit = js.native
  }
  object ReactProvider {
    
    @scala.inline
    def apply(
      addons: js.Any,
      channel: js.Any,
      getConfig: () => Config,
      getElements: Types_ => Collection,
      handleAPI: js.Any => Unit
    ): ReactProvider = {
      val __obj = js.Dynamic.literal(addons = addons.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], getConfig = js.Any.fromFunction0(getConfig), getElements = js.Any.fromFunction1(getElements), handleAPI = js.Any.fromFunction1(handleAPI))
      __obj.asInstanceOf[ReactProvider]
    }
    
    @scala.inline
    implicit class ReactProviderMutableBuilder[Self <: ReactProvider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddons(value: js.Any): Self = StObject.set(x, "addons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannel(value: js.Any): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetConfig(value: () => Config): Self = StObject.set(x, "getConfig", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetElements(value: Types_ => Collection): Self = StObject.set(x, "getElements", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleAPI(value: js.Any => Unit): Self = StObject.set(x, "handleAPI", js.Any.fromFunction1(value))
    }
  }
}
