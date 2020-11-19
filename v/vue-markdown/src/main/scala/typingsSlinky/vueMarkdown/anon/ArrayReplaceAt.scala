package typingsSlinky.vueMarkdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayReplaceAt extends js.Object {
  
  var arrayReplaceAt: js.Any = js.native
  
  var assign: js.Any = js.native
  
  var escapeHtml: js.Any = js.native
  
  var escapeRE: js.Any = js.native
  
  var fromCodePoint: js.Any = js.native
  
  var has: js.Any = js.native
  
  var isMdAsciiPunct: js.Any = js.native
  
  var isPunctChar: js.Any = js.native
  
  var isSpace: js.Any = js.native
  
  var isString: js.Any = js.native
  
  var isValidEntityCode: js.Any = js.native
  
  var isWhiteSpace: js.Any = js.native
  
  var lib: Mdurl = js.native
  
  var normalizeReference: js.Any = js.native
  
  var unescapeAll: js.Any = js.native
  
  var unescapeMd: js.Any = js.native
}
object ArrayReplaceAt {
  
  @scala.inline
  def apply(
    arrayReplaceAt: js.Any,
    assign: js.Any,
    escapeHtml: js.Any,
    escapeRE: js.Any,
    fromCodePoint: js.Any,
    has: js.Any,
    isMdAsciiPunct: js.Any,
    isPunctChar: js.Any,
    isSpace: js.Any,
    isString: js.Any,
    isValidEntityCode: js.Any,
    isWhiteSpace: js.Any,
    lib: Mdurl,
    normalizeReference: js.Any,
    unescapeAll: js.Any,
    unescapeMd: js.Any
  ): ArrayReplaceAt = {
    val __obj = js.Dynamic.literal(arrayReplaceAt = arrayReplaceAt.asInstanceOf[js.Any], assign = assign.asInstanceOf[js.Any], escapeHtml = escapeHtml.asInstanceOf[js.Any], escapeRE = escapeRE.asInstanceOf[js.Any], fromCodePoint = fromCodePoint.asInstanceOf[js.Any], has = has.asInstanceOf[js.Any], isMdAsciiPunct = isMdAsciiPunct.asInstanceOf[js.Any], isPunctChar = isPunctChar.asInstanceOf[js.Any], isSpace = isSpace.asInstanceOf[js.Any], isString = isString.asInstanceOf[js.Any], isValidEntityCode = isValidEntityCode.asInstanceOf[js.Any], isWhiteSpace = isWhiteSpace.asInstanceOf[js.Any], lib = lib.asInstanceOf[js.Any], normalizeReference = normalizeReference.asInstanceOf[js.Any], unescapeAll = unescapeAll.asInstanceOf[js.Any], unescapeMd = unescapeMd.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayReplaceAt]
  }
  
  @scala.inline
  implicit class ArrayReplaceAtOps[Self <: ArrayReplaceAt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArrayReplaceAt(value: js.Any): Self = this.set("arrayReplaceAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssign(value: js.Any): Self = this.set("assign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEscapeHtml(value: js.Any): Self = this.set("escapeHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEscapeRE(value: js.Any): Self = this.set("escapeRE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromCodePoint(value: js.Any): Self = this.set("fromCodePoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas(value: js.Any): Self = this.set("has", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMdAsciiPunct(value: js.Any): Self = this.set("isMdAsciiPunct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPunctChar(value: js.Any): Self = this.set("isPunctChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSpace(value: js.Any): Self = this.set("isSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsString(value: js.Any): Self = this.set("isString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsValidEntityCode(value: js.Any): Self = this.set("isValidEntityCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsWhiteSpace(value: js.Any): Self = this.set("isWhiteSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLib(value: Mdurl): Self = this.set("lib", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizeReference(value: js.Any): Self = this.set("normalizeReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnescapeAll(value: js.Any): Self = this.set("unescapeAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnescapeMd(value: js.Any): Self = this.set("unescapeMd", value.asInstanceOf[js.Any])
  }
}
