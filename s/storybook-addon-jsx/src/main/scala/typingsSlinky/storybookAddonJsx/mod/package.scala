package typingsSlinky.storybookAddonJsx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AddWithJSXFunc[StoryFnReturnType] = js.Function3[
    /* kind */ java.lang.String, 
    /* fn */ js.Function0[slinky.core.facade.ReactElement], 
    /* options */ js.UndefOr[typingsSlinky.storybookAddonJsx.mod.AddonParameters], 
    typingsSlinky.storybookAddons.typesMod.StoryApi[StoryFnReturnType]
  ]
  
  type displayNameFunc = js.Function1[/* element */ slinky.core.facade.ReactElement, java.lang.String]
}
