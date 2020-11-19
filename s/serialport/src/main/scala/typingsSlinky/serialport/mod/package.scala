package typingsSlinky.serialport

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  // Callbacks Type Defs
  type ErrorCallback = js.Function1[/* error */ js.UndefOr[js.Error | scala.Null], scala.Unit]
  
  type ModemBitsCallback = js.Function2[
    /* error */ js.UndefOr[js.Error | scala.Null], 
    /* status */ typingsSlinky.serialport.anon.Cts, 
    scala.Unit
  ]
  
  type darwinBinding = typingsSlinky.serialport.mod.BaseBinding
  
  type linuxBinding = typingsSlinky.serialport.mod.BaseBinding
  
  // Binding Type Defs
  type win32Binding = typingsSlinky.serialport.mod.BaseBinding
}
