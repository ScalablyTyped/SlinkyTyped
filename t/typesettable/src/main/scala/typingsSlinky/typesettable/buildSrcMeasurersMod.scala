package typingsSlinky.typesettable

import typingsSlinky.typesettable.buildSrcContextsMod.IRulerFactoryContext
import typingsSlinky.typesettable.buildSrcMeasurersAbstractMeasurerMod.IRuler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable/build/src/measurers", JSImport.Namespace)
@js.native
object buildSrcMeasurersMod extends js.Object {
  @js.native
  class AbstractMeasurer protected ()
    extends typingsSlinky.typesettable.buildSrcMeasurersAbstractMeasurerMod.AbstractMeasurer {
    def this(ruler: IRulerFactoryContext) = this()
    def this(ruler: IRuler) = this()
  }
  
  @js.native
  class CacheCharacterMeasurer protected ()
    extends typingsSlinky.typesettable.buildSrcMeasurersCacheCharacterMeasurerMod.CacheCharacterMeasurer {
    def this(ruler: IRulerFactoryContext) = this()
    def this(ruler: IRuler) = this()
    def this(ruler: IRulerFactoryContext, useGuards: Boolean) = this()
    def this(ruler: IRuler, useGuards: Boolean) = this()
  }
  
  @js.native
  class CacheMeasurer protected ()
    extends typingsSlinky.typesettable.buildSrcMeasurersCacheMeasurerMod.CacheMeasurer {
    def this(ruler: IRulerFactoryContext) = this()
    def this(ruler: IRuler) = this()
  }
  
  @js.native
  class CharacterMeasurer ()
    extends typingsSlinky.typesettable.buildSrcMeasurersCharacterMeasurerMod.CharacterMeasurer
  
  @js.native
  class Measurer protected ()
    extends typingsSlinky.typesettable.buildSrcMeasurersMeasurerMod.Measurer {
    def this(ruler: IRulerFactoryContext) = this()
    def this(ruler: IRuler) = this()
    def this(ruler: IRulerFactoryContext, useGuards: Boolean) = this()
    def this(ruler: IRuler, useGuards: Boolean) = this()
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
  
}

