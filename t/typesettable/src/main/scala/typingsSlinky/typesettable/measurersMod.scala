package typingsSlinky.typesettable

import typingsSlinky.typesettable.abstractMeasurerMod.IRuler
import typingsSlinky.typesettable.contextsMod.IRulerFactoryContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typesettable/build/src/measurers", JSImport.Namespace)
@js.native
object measurersMod extends js.Object {
  
  @js.native
  class AbstractMeasurer protected ()
    extends typingsSlinky.typesettable.abstractMeasurerMod.AbstractMeasurer {
    def this(ruler: IRuler) = this()
    def this(ruler: IRulerFactoryContext) = this()
  }
  /* static members */
  @js.native
  object AbstractMeasurer extends js.Object {
    
    /**
      * A string representing the full ascender/descender range of your text.
      *
      * Note that this is really only applicable to western alphabets. If you are
      * using a different locale language such as arabic or chinese, you may want
      * to override this.
      */
    var HEIGHT_TEXT: String = js.native
  }
  
  @js.native
  class CacheCharacterMeasurer protected ()
    extends typingsSlinky.typesettable.cacheCharacterMeasurerMod.CacheCharacterMeasurer {
    def this(ruler: IRuler) = this()
    def this(ruler: IRulerFactoryContext) = this()
    def this(ruler: IRuler, useGuards: Boolean) = this()
    def this(ruler: IRulerFactoryContext, useGuards: Boolean) = this()
  }
  
  @js.native
  class CacheMeasurer protected ()
    extends typingsSlinky.typesettable.cacheMeasurerMod.CacheMeasurer {
    def this(ruler: IRuler) = this()
    def this(ruler: IRulerFactoryContext) = this()
  }
  
  @js.native
  class CharacterMeasurer ()
    extends typingsSlinky.typesettable.characterMeasurerMod.CharacterMeasurer
  
  @js.native
  class Measurer protected ()
    extends typingsSlinky.typesettable.measurerMod.Measurer {
    def this(ruler: IRuler) = this()
    def this(ruler: IRulerFactoryContext) = this()
    def this(ruler: IRuler, useGuards: Boolean) = this()
    def this(ruler: IRulerFactoryContext, useGuards: Boolean) = this()
  }
}
