package typingsSlinky.xelib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ContainerHandle = typingsSlinky.xelib.mod.Handle with js.Object
  
  type ElementHandle = typingsSlinky.xelib.mod.Handle with js.Object
  
  type FileHandle = typingsSlinky.xelib.mod.ContainerHandle with js.Object
  
  type Handle = scala.Double with js.Object
  
  type I[T] = T
  
  type NodeTreeHandle = typingsSlinky.xelib.mod.Handle with js.Object
  
  type RecordHandle = typingsSlinky.xelib.mod.ElementHandle with js.Object
  
  type Zeroable[H /* <: typingsSlinky.xelib.mod.Handle */] = H | typingsSlinky.xelib.xelibNumbers.`0`
}
