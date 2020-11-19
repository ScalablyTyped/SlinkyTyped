package typingsSlinky.streamChain

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Stream = typingsSlinky.node.streamMod.Readable | typingsSlinky.node.streamMod.Writable | typingsSlinky.node.streamMod.Duplex | typingsSlinky.node.streamMod.Transform
  
  type StreamItem = typingsSlinky.streamChain.mod.Stream | typingsSlinky.streamChain.mod.TransformFunction
  
  type TransformFunction = js.Function2[/* chunk */ js.Any, /* encoding */ js.UndefOr[java.lang.String], js.Any]
}
