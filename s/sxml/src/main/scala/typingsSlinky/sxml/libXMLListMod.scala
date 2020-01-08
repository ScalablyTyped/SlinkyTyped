package typingsSlinky.sxml

import typingsSlinky.sxml.libXMLMod.XML
import typingsSlinky.tstl.tstlMod.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sxml/lib/XMLList", JSImport.Namespace)
@js.native
object libXMLListMod extends js.Object {
  @js.native
  class XMLList () extends Vector[XML] {
    def getTag(): String = js.native
    def toString(level: Double): String = js.native
  }
  
  @js.native
  object XMLList extends js.Object {
    type Iterator = typingsSlinky.tstl.containerVectorMod.Vector.Iterator[XML]
    type ReverseIterator = typingsSlinky.tstl.containerVectorMod.Vector.ReverseIterator[XML]
    type iterator = Iterator
    type reverse_iterator = ReverseIterator
  }
  
}

