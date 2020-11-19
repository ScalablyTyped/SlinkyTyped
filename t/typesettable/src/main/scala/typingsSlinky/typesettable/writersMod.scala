package typingsSlinky.typesettable

import typingsSlinky.typesettable.anon.KinIXAlignnumber
import typingsSlinky.typesettable.anon.KinIYAlignnumber
import typingsSlinky.typesettable.contextsMod.IPenFactoryContext
import typingsSlinky.typesettable.measurersMod.AbstractMeasurer
import typingsSlinky.typesettable.wrappersMod.Wrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typesettable/build/src/writers", JSImport.Namespace)
@js.native
object writersMod extends js.Object {
  
  @js.native
  class Writer protected ()
    extends typingsSlinky.typesettable.writerMod.Writer {
    def this(_measurer: AbstractMeasurer, _penFactory: IPenFactoryContext[_]) = this()
    def this(_measurer: AbstractMeasurer, _penFactory: IPenFactoryContext[_], _wrapper: Wrapper) = this()
  }
  /* static members */
  @js.native
  object Writer extends js.Object {
    
    var SupportedRotation: js.Any = js.native
    
    var XOffsetFactor: KinIXAlignnumber = js.native
    
    var YOffsetFactor: KinIYAlignnumber = js.native
  }
}
