package typingsSlinky.streamsaver

import typingsSlinky.std.QueuingStrategy
import typingsSlinky.std.Transformer
import typingsSlinky.std.UnderlyingSink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("streamsaver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("streamsaver", "TransformStream")
  @js.native
  class TransformStream[I, O] protected ()
    extends typingsSlinky.std.TransformStream[I, O] {
    def this(
      transformer: Transformer[I, O],
      writableStrategy: QueuingStrategy[I],
      readableStrategy: QueuingStrategy[O]
    ) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("streamsaver", "WritableStream")
  @js.native
  class WritableStream[W] ()
    extends typingsSlinky.std.WritableStream[W] {
    def this(underlyingSink: UnderlyingSink[W]) = this()
    def this(underlyingSink: js.UndefOr[scala.Nothing], strategy: QueuingStrategy[W]) = this()
    def this(underlyingSink: UnderlyingSink[W], strategy: QueuingStrategy[W]) = this()
  }
  
  @JSImport("streamsaver", "createWriteStream")
  @js.native
  def createWriteStream(filename: String): typingsSlinky.std.WritableStream[_] = js.native
  @JSImport("streamsaver", "createWriteStream")
  @js.native
  def createWriteStream(filename: String, options: CreateWriteStreamOptions[_, _]): typingsSlinky.std.WritableStream[_] = js.native
  
  @JSImport("streamsaver", "mitm")
  @js.native
  def mitm: String = js.native
  @scala.inline
  def mitm_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mitm")(x.asInstanceOf[js.Any])
  
  @JSImport("streamsaver", "supported")
  @js.native
  def supported: Boolean = js.native
  @scala.inline
  def supported_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supported")(x.asInstanceOf[js.Any])
  
  @JSImport("streamsaver", "version")
  @js.native
  val version: Version_ = js.native
  
  @js.native
  trait CreateWriteStreamOptions[I, O] extends StObject {
    
    /**
      * URL to serve the stream from. This is the URL that the browser is going to request from the service worker.
      * You might need to provide this if you're using a custom service worker.
      */
    var pathname: js.UndefOr[String] = js.native
    
    var readableStrategy: js.UndefOr[QueuingStrategy[O]] = js.native
    
    /**
      * Indicates the size of the streamed data and allows the browser to show progress while downloading.
      */
    var size: js.UndefOr[Double] = js.native
    
    var writableStrategy: js.UndefOr[QueuingStrategy[I]] = js.native
  }
  object CreateWriteStreamOptions {
    
    @scala.inline
    def apply[I, O](): CreateWriteStreamOptions[I, O] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateWriteStreamOptions[I, O]]
    }
    
    @scala.inline
    implicit class CreateWriteStreamOptionsMutableBuilder[Self <: CreateWriteStreamOptions[_, _], I, O] (val x: Self with (CreateWriteStreamOptions[I, O])) extends AnyVal {
      
      @scala.inline
      def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathnameUndefined: Self = StObject.set(x, "pathname", js.undefined)
      
      @scala.inline
      def setReadableStrategy(value: QueuingStrategy[O]): Self = StObject.set(x, "readableStrategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadableStrategyUndefined: Self = StObject.set(x, "readableStrategy", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setWritableStrategy(value: QueuingStrategy[I]): Self = StObject.set(x, "writableStrategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWritableStrategyUndefined: Self = StObject.set(x, "writableStrategy", js.undefined)
    }
  }
  
  @js.native
  trait Version_ extends StObject {
    
    var dot: Double = js.native
    
    var full: String = js.native
    
    var major: Double = js.native
    
    var minor: Double = js.native
  }
  object Version_ {
    
    @scala.inline
    def apply(dot: Double, full: String, major: Double, minor: Double): Version_ = {
      val __obj = js.Dynamic.literal(dot = dot.asInstanceOf[js.Any], full = full.asInstanceOf[js.Any], major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any])
      __obj.asInstanceOf[Version_]
    }
    
    @scala.inline
    implicit class Version_MutableBuilder[Self <: Version_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDot(value: Double): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFull(value: String): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMajor(value: Double): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinor(value: Double): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
    }
  }
}
