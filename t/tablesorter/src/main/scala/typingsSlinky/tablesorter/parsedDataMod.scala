package typingsSlinky.tablesorter

import typingsSlinky.tablesorter.mod.global.HTMLElement
import typingsSlinky.tablesorter.mod.global.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parsedDataMod {
  
  @js.native
  trait ParsedData extends StObject {
    
    /**
      * The jQuery-objects containing the cells of the rows.
      */
    @JSName("$cells")
    var $cells: js.Array[JQuery[HTMLElement]] = js.native
    
    /**
      * The parsed values of the rows.
      */
    var parsed: js.Array[_] = js.native
    
    /**
      * The raw values of the rows.
      */
    var raw: js.Array[String] = js.native
  }
  object ParsedData {
    
    @scala.inline
    def apply($cells: js.Array[JQuery[HTMLElement]], parsed: js.Array[_], raw: js.Array[String]): ParsedData = {
      val __obj = js.Dynamic.literal($cells = $cells.asInstanceOf[js.Any], parsed = parsed.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedData]
    }
    
    @scala.inline
    implicit class ParsedDataMutableBuilder[Self <: ParsedData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$cells(value: js.Array[JQuery[HTMLElement]]): Self = StObject.set(x, "$cells", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$cellsVarargs(value: JQuery[HTMLElement]*): Self = StObject.set(x, "$cells", js.Array(value :_*))
      
      @scala.inline
      def setParsed(value: js.Array[_]): Self = StObject.set(x, "parsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParsedVarargs(value: js.Any*): Self = StObject.set(x, "parsed", js.Array(value :_*))
      
      @scala.inline
      def setRaw(value: js.Array[String]): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawVarargs(value: String*): Self = StObject.set(x, "raw", js.Array(value :_*))
    }
  }
}
