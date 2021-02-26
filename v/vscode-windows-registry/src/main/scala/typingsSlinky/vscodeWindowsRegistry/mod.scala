package typingsSlinky.vscodeWindowsRegistry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vscode-windows-registry", "GetStringRegKey")
  @js.native
  def GetStringRegKey(hive: HKEY, path: String, name: String): js.UndefOr[String] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vscodeWindowsRegistry.vscodeWindowsRegistryStrings.HKEY_CURRENT_USER
    - typingsSlinky.vscodeWindowsRegistry.vscodeWindowsRegistryStrings.HKEY_LOCAL_MACHINE
    - typingsSlinky.vscodeWindowsRegistry.vscodeWindowsRegistryStrings.HKEY_CLASSES_ROOT
    - typingsSlinky.vscodeWindowsRegistry.vscodeWindowsRegistryStrings.HKEY_USERS
    - typingsSlinky.vscodeWindowsRegistry.vscodeWindowsRegistryStrings.HKEY_CURRENT_CONFIG
  */
  trait HKEY extends StObject
  object HKEY {
    
    @scala.inline
    def HKEY_CLASSES_ROOT: typingsSlinky.vscodeWindowsRegistry.vscodeWindowsRegistryStrings.HKEY_CLASSES_ROOT = "HKEY_CLASSES_ROOT".asInstanceOf[typingsSlinky.vscodeWindowsRegistry.vscodeWindowsRegistryStrings.HKEY_CLASSES_ROOT]
    
    @scala.inline
    def HKEY_CURRENT_CONFIG: typingsSlinky.vscodeWindowsRegistry.vscodeWindowsRegistryStrings.HKEY_CURRENT_CONFIG = "HKEY_CURRENT_CONFIG".asInstanceOf[typingsSlinky.vscodeWindowsRegistry.vscodeWindowsRegistryStrings.HKEY_CURRENT_CONFIG]
    
    @scala.inline
    def HKEY_CURRENT_USER: typingsSlinky.vscodeWindowsRegistry.vscodeWindowsRegistryStrings.HKEY_CURRENT_USER = "HKEY_CURRENT_USER".asInstanceOf[typingsSlinky.vscodeWindowsRegistry.vscodeWindowsRegistryStrings.HKEY_CURRENT_USER]
    
    @scala.inline
    def HKEY_LOCAL_MACHINE: typingsSlinky.vscodeWindowsRegistry.vscodeWindowsRegistryStrings.HKEY_LOCAL_MACHINE = "HKEY_LOCAL_MACHINE".asInstanceOf[typingsSlinky.vscodeWindowsRegistry.vscodeWindowsRegistryStrings.HKEY_LOCAL_MACHINE]
    
    @scala.inline
    def HKEY_USERS: typingsSlinky.vscodeWindowsRegistry.vscodeWindowsRegistryStrings.HKEY_USERS = "HKEY_USERS".asInstanceOf[typingsSlinky.vscodeWindowsRegistry.vscodeWindowsRegistryStrings.HKEY_USERS]
  }
}
