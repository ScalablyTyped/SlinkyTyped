package typingsSlinky.winreg

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.winreg.Winreg.Options
import typingsSlinky.winreg.Winreg.Registry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Winreg extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Winreg")
    @js.native
    class ^ protected () extends Registry {
      /**
        * Creates a registry object, which provides access to a single registry key.
        * Note: This class is returned by a call to ```require('winreg')```.
        *
        * @public
        * @class
        *
        * @param {@link Options} options - the options
        *
        * @example
        * var Registry = require('winreg')
        * ,   autoStartCurrentUser = new Registry({
        *       hive: Registry.HKCU,
        *       key:  '\\Software\\Microsoft\\Windows\\CurrentVersion\\Run'
        *     });
        */
      def this(options: Options) = this()
    }
    
    @JSGlobal("Winreg")
    @js.native
    val ^ : WinregStatic = js.native
    
    type _To = WinregStatic
    
    /* This means you don't have to write `^`, but can instead just say `Winreg.foo` */
    override def _to: WinregStatic = ^
  }
}
