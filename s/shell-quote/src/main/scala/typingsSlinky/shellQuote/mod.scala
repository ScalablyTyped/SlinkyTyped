package typingsSlinky.shellQuote

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.shellQuote.shellQuoteStrings.glob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("shell-quote", "parse")
  @js.native
  def parse(cmd: String): js.Array[ParseEntry] = js.native
  @JSImport("shell-quote", "parse")
  @js.native
  def parse(cmd: String, env: js.UndefOr[scala.Nothing], opts: ParseOptions): js.Array[ParseEntry] = js.native
  @JSImport("shell-quote", "parse")
  @js.native
  def parse(cmd: String, env: StringDictionary[js.UndefOr[String]]): js.Array[ParseEntry] = js.native
  @JSImport("shell-quote", "parse")
  @js.native
  def parse(cmd: String, env: StringDictionary[js.UndefOr[String]], opts: ParseOptions): js.Array[ParseEntry] = js.native
  @JSImport("shell-quote", "parse")
  @js.native
  def parse[T /* <: js.Object | String */](cmd: String, env: js.Function1[/* key */ String, js.UndefOr[T]]): js.Array[ParseEntry | T] = js.native
  @JSImport("shell-quote", "parse")
  @js.native
  def parse[T /* <: js.Object | String */](cmd: String, env: js.Function1[/* key */ String, js.UndefOr[T]], opts: ParseOptions): js.Array[ParseEntry | T] = js.native
  
  @JSImport("shell-quote", "quote")
  @js.native
  def quote(args: js.Array[String]): String = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.shellQuote.shellQuoteStrings.VerticallineVerticalline
    - typingsSlinky.shellQuote.shellQuoteStrings.AmpersandAmpersand
    - typingsSlinky.shellQuote.shellQuoteStrings.SemicolonSemicolon
    - typingsSlinky.shellQuote.shellQuoteStrings.VerticallineAmpersand
    - typingsSlinky.shellQuote.shellQuoteStrings.LessthansignLeftparenthesis
    - typingsSlinky.shellQuote.shellQuoteStrings.GreaterthansignGreaterthansign
    - typingsSlinky.shellQuote.shellQuoteStrings.GreaterthansignAmpersand
    - typingsSlinky.shellQuote.shellQuoteStrings.Ampersand
    - typingsSlinky.shellQuote.shellQuoteStrings.Semicolon
    - typingsSlinky.shellQuote.shellQuoteStrings.Leftparenthesis
    - typingsSlinky.shellQuote.shellQuoteStrings.Rightparenthesis
    - typingsSlinky.shellQuote.shellQuoteStrings.Verticalline
    - typingsSlinky.shellQuote.shellQuoteStrings.Lessthansign
    - typingsSlinky.shellQuote.shellQuoteStrings.Greaterthansign
  */
  trait ControlOperator extends StObject
  object ControlOperator {
    
    @scala.inline
    def Ampersand: typingsSlinky.shellQuote.shellQuoteStrings.Ampersand = "&".asInstanceOf[typingsSlinky.shellQuote.shellQuoteStrings.Ampersand]
    
    @scala.inline
    def AmpersandAmpersand: typingsSlinky.shellQuote.shellQuoteStrings.AmpersandAmpersand = "&&".asInstanceOf[typingsSlinky.shellQuote.shellQuoteStrings.AmpersandAmpersand]
    
    @scala.inline
    def Greaterthansign: typingsSlinky.shellQuote.shellQuoteStrings.Greaterthansign = ">".asInstanceOf[typingsSlinky.shellQuote.shellQuoteStrings.Greaterthansign]
    
    @scala.inline
    def GreaterthansignAmpersand: typingsSlinky.shellQuote.shellQuoteStrings.GreaterthansignAmpersand = ">&".asInstanceOf[typingsSlinky.shellQuote.shellQuoteStrings.GreaterthansignAmpersand]
    
    @scala.inline
    def GreaterthansignGreaterthansign: typingsSlinky.shellQuote.shellQuoteStrings.GreaterthansignGreaterthansign = ">>".asInstanceOf[typingsSlinky.shellQuote.shellQuoteStrings.GreaterthansignGreaterthansign]
    
    @scala.inline
    def Leftparenthesis: typingsSlinky.shellQuote.shellQuoteStrings.Leftparenthesis = "(".asInstanceOf[typingsSlinky.shellQuote.shellQuoteStrings.Leftparenthesis]
    
    @scala.inline
    def Lessthansign: typingsSlinky.shellQuote.shellQuoteStrings.Lessthansign = "<".asInstanceOf[typingsSlinky.shellQuote.shellQuoteStrings.Lessthansign]
    
    @scala.inline
    def LessthansignLeftparenthesis: typingsSlinky.shellQuote.shellQuoteStrings.LessthansignLeftparenthesis = "<(".asInstanceOf[typingsSlinky.shellQuote.shellQuoteStrings.LessthansignLeftparenthesis]
    
    @scala.inline
    def Rightparenthesis: typingsSlinky.shellQuote.shellQuoteStrings.Rightparenthesis = ")".asInstanceOf[typingsSlinky.shellQuote.shellQuoteStrings.Rightparenthesis]
    
    @scala.inline
    def Semicolon: typingsSlinky.shellQuote.shellQuoteStrings.Semicolon = ";".asInstanceOf[typingsSlinky.shellQuote.shellQuoteStrings.Semicolon]
    
    @scala.inline
    def SemicolonSemicolon: typingsSlinky.shellQuote.shellQuoteStrings.SemicolonSemicolon = ";;".asInstanceOf[typingsSlinky.shellQuote.shellQuoteStrings.SemicolonSemicolon]
    
    @scala.inline
    def Verticalline: typingsSlinky.shellQuote.shellQuoteStrings.Verticalline = "|".asInstanceOf[typingsSlinky.shellQuote.shellQuoteStrings.Verticalline]
    
    @scala.inline
    def VerticallineAmpersand: typingsSlinky.shellQuote.shellQuoteStrings.VerticallineAmpersand = "|&".asInstanceOf[typingsSlinky.shellQuote.shellQuoteStrings.VerticallineAmpersand]
    
    @scala.inline
    def VerticallineVerticalline: typingsSlinky.shellQuote.shellQuoteStrings.VerticallineVerticalline = "||".asInstanceOf[typingsSlinky.shellQuote.shellQuoteStrings.VerticallineVerticalline]
  }
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsSlinky.shellQuote.anon.Op
    - typingsSlinky.shellQuote.anon.Pattern
    - typingsSlinky.shellQuote.anon.Comment
  */
  type ParseEntry = _ParseEntry | String
  
  @js.native
  trait ParseOptions extends StObject {
    
    /**
      * Custom escape character, default value is `\`
      */
    var escape: js.UndefOr[String] = js.native
  }
  object ParseOptions {
    
    @scala.inline
    def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    @scala.inline
    implicit class ParseOptionsMutableBuilder[Self <: ParseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEscape(value: String): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
    }
  }
  
  trait _ParseEntry extends StObject
  object _ParseEntry {
    
    @scala.inline
    def Comment(comment: String): typingsSlinky.shellQuote.anon.Comment = {
      val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.shellQuote.anon.Comment]
    }
    
    @scala.inline
    def Op(op: ControlOperator): typingsSlinky.shellQuote.anon.Op = {
      val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.shellQuote.anon.Op]
    }
    
    @scala.inline
    def Pattern(op: glob, pattern: String): typingsSlinky.shellQuote.anon.Pattern = {
      val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.shellQuote.anon.Pattern]
    }
  }
}
