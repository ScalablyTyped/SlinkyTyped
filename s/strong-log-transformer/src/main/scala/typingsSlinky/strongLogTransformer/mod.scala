package typingsSlinky.strongLogTransformer

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.node.NodeJS.ReadWriteStream
import typingsSlinky.strongLogTransformer.anon.PartialOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("strong-log-transformer", JSImport.Namespace)
  @js.native
  val ^ : StrongLogTransformer = js.native
  
  @js.native
  trait Options extends StObject {
    
    var format: String = js.native
    
    var mergeMultiline: Boolean = js.native
    
    var tag: String = js.native
    
    var timeStamp: Boolean = js.native
  }
  object Options {
    
    @scala.inline
    def apply(format: String, mergeMultiline: Boolean, tag: String, timeStamp: Boolean): Options = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], mergeMultiline = mergeMultiline.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMergeMultiline(value: Boolean): Self = StObject.set(x, "mergeMultiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeStamp(value: Boolean): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StrongLogTransformer extends StObject {
    
    def apply(): ReadWriteStream = js.native
    def apply(options: PartialOptions): ReadWriteStream = js.native
    
    var DEFAULTS: Options = js.native
    
    def cli(args: js.Array[String]): Unit = js.native
  }
  
  type _To = StrongLogTransformer
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: StrongLogTransformer = ^
}
