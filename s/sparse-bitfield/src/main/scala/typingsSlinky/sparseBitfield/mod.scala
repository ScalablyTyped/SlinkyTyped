package typingsSlinky.sparseBitfield

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typingsSlinky.memoryPager.mod.PagerInstance
import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("sparse-bitfield", JSImport.Namespace)
  @js.native
  val ^ : BitField = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("sparse-bitfield", JSImport.Namespace)
  @js.native
  class Class () extends BitFieldInstance {
    def this(bufferOrOptions: Buffer) = this()
    def this(bufferOrOptions: Options) = this()
  }
  
  @js.native
  trait BitField
    extends Instantiable0[BitFieldInstance]
       with Instantiable1[(/* bufferOrOptions */ Buffer) | (/* bufferOrOptions */ Options), BitFieldInstance] {
    
    def apply(): BitFieldInstance = js.native
    def apply(bufferOrOptions: Buffer): BitFieldInstance = js.native
    def apply(bufferOrOptions: Options): BitFieldInstance = js.native
  }
  
  @js.native
  trait BitFieldInstance extends StObject {
    
    /**
      * Get the value of a bit.
      */
    def get(index: Double): Boolean = js.native
    
    /**
      * Get the value of a byte.
      */
    def getByte(index: Double): Double = js.native
    
    /**
      * A `memory-pager` instance that is managing the underlying memory.
      * If you set `trackUpdates` to `true` in the constructor you can use `.lastUpdate()` on this instance
      * to get the last updated memory page.
      */
    val pages: PagerInstance = js.native
    
    /**
      * Set a bit to true or false.
      */
    def set(index: Double, value: Boolean): Boolean = js.native
    
    /**
      * Set a byte to a new value.
      */
    def setByte(index: Double, byte: Double): Boolean = js.native
    
    /**
      * Get a single buffer representing the entire bitfield.
      */
    def toBuffer(): Buffer = js.native
  }
  object BitFieldInstance {
    
    @scala.inline
    def apply(
      get: Double => Boolean,
      getByte: Double => Double,
      pages: PagerInstance,
      set: (Double, Boolean) => Boolean,
      setByte: (Double, Double) => Boolean,
      toBuffer: () => Buffer
    ): BitFieldInstance = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), getByte = js.Any.fromFunction1(getByte), pages = pages.asInstanceOf[js.Any], set = js.Any.fromFunction2(set), setByte = js.Any.fromFunction2(setByte), toBuffer = js.Any.fromFunction0(toBuffer))
      __obj.asInstanceOf[BitFieldInstance]
    }
    
    @scala.inline
    implicit class BitFieldInstanceMutableBuilder[Self <: BitFieldInstance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGet(value: Double => Boolean): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetByte(value: Double => Double): Self = StObject.set(x, "getByte", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPages(value: PagerInstance): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSet(value: (Double, Boolean) => Boolean): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetByte(value: (Double, Double) => Boolean): Self = StObject.set(x, "setByte", js.Any.fromFunction2(value))
      
      @scala.inline
      def setToBuffer(value: () => Buffer): Self = StObject.set(x, "toBuffer", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * An existing bitfield.
      */
    var buffer: js.UndefOr[Buffer] = js.native
    
    /**
      * @default 0
      */
    var pageOffset: js.UndefOr[Double] = js.native
    
    /**
      * How big should the partial buffers be.
      * @default 1024
      */
    var pageSize: js.UndefOr[Double] = js.native
    
    /**
      * A pre-configured Pager instance.
      */
    var pages: js.UndefOr[PagerInstance] = js.native
    
    /**
      * Track when pages are being updated in the pager.
      * @default false
      */
    var trackUpdates: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuffer(value: Buffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      @scala.inline
      def setPageOffset(value: Double): Self = StObject.set(x, "pageOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageOffsetUndefined: Self = StObject.set(x, "pageOffset", js.undefined)
      
      @scala.inline
      def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      @scala.inline
      def setPages(value: PagerInstance): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
      
      @scala.inline
      def setTrackUpdates(value: Boolean): Self = StObject.set(x, "trackUpdates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackUpdatesUndefined: Self = StObject.set(x, "trackUpdates", js.undefined)
    }
  }
  
  type _To = BitField
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: BitField = ^
}
