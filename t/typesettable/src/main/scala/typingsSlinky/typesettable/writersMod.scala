package typingsSlinky.typesettable

import typingsSlinky.typesettable.anon.KinIXAlignnumber
import typingsSlinky.typesettable.anon.KinIYAlignnumber
import typingsSlinky.typesettable.contextsMod.IPenFactoryContext
import typingsSlinky.typesettable.measurersMod.AbstractMeasurer
import typingsSlinky.typesettable.wrappersMod.Wrapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object writersMod {
  
  @JSImport("typesettable/build/src/writers", "Writer")
  @js.native
  class Writer protected ()
    extends typingsSlinky.typesettable.writerMod.Writer {
    def this(_measurer: AbstractMeasurer, _penFactory: IPenFactoryContext[_]) = this()
    def this(_measurer: AbstractMeasurer, _penFactory: IPenFactoryContext[_], _wrapper: Wrapper) = this()
  }
  /* static members */
  object Writer {
    
    @JSImport("typesettable/build/src/writers", "Writer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typesettable/build/src/writers", "Writer.SupportedRotation")
    @js.native
    def SupportedRotation: js.Any = js.native
    @scala.inline
    def SupportedRotation_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SupportedRotation")(x.asInstanceOf[js.Any])
    
    @JSImport("typesettable/build/src/writers", "Writer.XOffsetFactor")
    @js.native
    def XOffsetFactor: KinIXAlignnumber = js.native
    @scala.inline
    def XOffsetFactor_=(x: KinIXAlignnumber): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("XOffsetFactor")(x.asInstanceOf[js.Any])
    
    @JSImport("typesettable/build/src/writers", "Writer.YOffsetFactor")
    @js.native
    def YOffsetFactor: KinIYAlignnumber = js.native
    @scala.inline
    def YOffsetFactor_=(x: KinIYAlignnumber): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("YOffsetFactor")(x.asInstanceOf[js.Any])
  }
}
