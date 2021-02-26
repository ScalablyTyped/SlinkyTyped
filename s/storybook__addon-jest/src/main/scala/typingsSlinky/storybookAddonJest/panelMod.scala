package typingsSlinky.storybookAddonJest

import typingsSlinky.react.mod.Context
import typingsSlinky.storybookAddonJest.anon.Active
import typingsSlinky.storybookAddonJest.anon.ComponentDidCatch
import typingsSlinky.storybookAddonJest.anon.ReadonlyHocProps
import typingsSlinky.storybookAddonJest.provideJestResultMod.HocProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panelMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@storybook/addon-jest/dist/components/Panel", JSImport.Default)
  @js.native
  class default protected () extends ComponentDidCatch {
    def this(props: ReadonlyHocProps) = this()
    def this(props: HocProps) = this()
    def this(props: HocProps, context: js.Any) = this()
  }
  object default {
    
    @JSImport("@storybook/addon-jest/dist/components/Panel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/addon-jest/dist/components/Panel", "default.contextType")
    @js.native
    def contextType: js.UndefOr[Context[js.Any]] = js.native
    @scala.inline
    def contextType_=(x: js.UndefOr[Context[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-jest/dist/components/Panel", "default.defaultProps")
    @js.native
    def defaultProps: Active = js.native
    @scala.inline
    def defaultProps_=(x: Active): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
