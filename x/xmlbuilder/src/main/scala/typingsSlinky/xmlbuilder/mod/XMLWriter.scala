package typingsSlinky.xmlbuilder.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a writer which outputs an XML document.
  */
@js.native
trait XMLWriter extends js.Object {
  /** 
    * Writes an attribute. 
    * 
    * @param att - current attribute
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var attribute: js.UndefOr[
    js.Function3[/* att */ XMLAttribute, /* options */ WriterOptions, /* level */ Double, _]
  ] = js.native
  /** 
    * Writes a CDATA node.
    * 
    * @param node - current node
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var cdata: js.UndefOr[
    js.Function3[/* node */ XMLCData, /* options */ WriterOptions, /* level */ Double, _]
  ] = js.native
  /** 
    * Called right before completing writing an attribute. This function 
    * does not produce any output, but can be used to alter the state of 
    * the writer. 
    * 
    * @param node - current attribute
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var closeAttribute: js.UndefOr[
    js.Function3[/* att */ XMLAttribute, /* options */ WriterOptions, /* level */ Double, Unit]
  ] = js.native
  /** 
    * Called right before completing writing a node. This function does not 
    * produce any output, but can be used to alter the state of the writer.
    * 
    * @param node - current node
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var closeNode: js.UndefOr[
    js.Function3[/* node */ XMLNode, /* options */ WriterOptions, /* level */ Double, Unit]
  ] = js.native
  /** 
    * Writes a comment node. 
    * 
    * @param node - current node
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var comment: js.UndefOr[
    js.Function3[/* node */ XMLComment, /* options */ WriterOptions, /* level */ Double, _]
  ] = js.native
  /** 
    * Writes the XML declaration (e.g. `<?xml version="1.0"?>`). 
    * 
    * @param node - XML declaration node
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var declaration: js.UndefOr[
    js.Function3[/* node */ XMLDeclaration, /* options */ WriterOptions, /* level */ Double, _]
  ] = js.native
  /** 
    * Writes the DocType node and its children. 
    * 
    * _Note:_ Be careful when overriding this function as this function
    * is also responsible for writing the internal subset of the DTD. 
    * 
    * @param node - DOCTYPE node
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var docType: js.UndefOr[
    js.Function3[/* node */ XMLDocType, /* options */ WriterOptions, /* level */ Double, _]
  ] = js.native
  /** 
    * Writes an attribute node (`!ATTLIST`) inside the DTD. 
    * 
    * @param node - current node
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var dtdAttList: js.UndefOr[
    js.Function3[/* node */ XMLDTDAttList, /* options */ WriterOptions, /* level */ Double, _]
  ] = js.native
  /** 
    * Writes an element node (`!ELEMENT`) inside the DTD. 
    * 
    * @param node - current node
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var dtdElement: js.UndefOr[
    js.Function3[/* node */ XMLDTDElement, /* options */ WriterOptions, /* level */ Double, _]
  ] = js.native
  /** 
    * Writes an entity node (`!ENTITY`) inside the DTD. 
    * 
    * @param node - current node
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var dtdEntity: js.UndefOr[
    js.Function3[/* node */ XMLDTDEntity, /* options */ WriterOptions, /* level */ Double, _]
  ] = js.native
  /** 
    * Writes a notation node (`!NOTATION`) inside the DTD. 
    * 
    * @param node - current node
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var dtdNotation: js.UndefOr[
    js.Function3[/* node */ XMLDTDNotation, /* options */ WriterOptions, /* level */ Double, _]
  ] = js.native
  /** 
    * Writes an element node. 
    * 
    * _Note:_ Be careful when overriding this function as this function
    * is also responsible for writing the element attributes and child 
    * nodes.
    * 
    * 
    * @param node - current node
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var element: js.UndefOr[
    js.Function3[/* node */ XMLElement, /* options */ WriterOptions, /* level */ Double, _]
  ] = js.native
  /** 
    * Writes the newline string. 
    * 
    * @param node - current node
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var endline: js.UndefOr[
    js.Function3[/* node */ XMLNode, /* options */ WriterOptions, /* level */ Double, _]
  ] = js.native
  /** 
    * Writes the indentation string for the given level. 
    * 
    * @param node - current node
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var indent: js.UndefOr[
    js.Function3[/* node */ XMLNode, /* options */ WriterOptions, /* level */ Double, _]
  ] = js.native
  /** 
    * Called right after starting writing an attribute. This function does 
    * not produce any output, but can be used to alter the state of the 
    * writer. 
    * 
    * @param node - current attribute
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var openAttribute: js.UndefOr[
    js.Function3[/* att */ XMLAttribute, /* options */ WriterOptions, /* level */ Double, Unit]
  ] = js.native
  /** 
    * Called right after starting writing a node. This function does not 
    * produce any output, but can be used to alter the state of the writer. 
    * 
    * @param node - current node
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var openNode: js.UndefOr[
    js.Function3[/* node */ XMLNode, /* options */ WriterOptions, /* level */ Double, Unit]
  ] = js.native
  /** 
    * Writes a processing instruction node. 
    * 
    * @param node - current node
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var processingInstruction: js.UndefOr[
    js.Function3[
      /* node */ XMLProcessingInstruction, 
      /* options */ WriterOptions, 
      /* level */ Double, 
      _
    ]
  ] = js.native
  /** 
    * Writes a raw text node. 
    * 
    * @param node - current node
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var raw: js.UndefOr[
    js.Function3[/* node */ XMLRaw, /* options */ WriterOptions, /* level */ Double, _]
  ] = js.native
  /** 
    * Writes a text node. 
    * 
    * @param node - current node
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var text: js.UndefOr[
    js.Function3[/* node */ XMLText, /* options */ WriterOptions, /* level */ Double, _]
  ] = js.native
}

object XMLWriter {
  @scala.inline
  def apply(): XMLWriter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XMLWriter]
  }
  @scala.inline
  implicit class XMLWriterOps[Self <: XMLWriter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttribute(value: (/* att */ XMLAttribute, /* options */ WriterOptions, /* level */ Double) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attribute")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAttribute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attribute")(js.undefined)
        ret
    }
    @scala.inline
    def withCdata(value: (/* node */ XMLCData, /* options */ WriterOptions, /* level */ Double) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cdata")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutCdata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cdata")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseAttribute(value: (/* att */ XMLAttribute, /* options */ WriterOptions, /* level */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeAttribute")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutCloseAttribute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeAttribute")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseNode(value: (/* node */ XMLNode, /* options */ WriterOptions, /* level */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeNode")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutCloseNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeNode")(js.undefined)
        ret
    }
    @scala.inline
    def withComment(value: (/* node */ XMLComment, /* options */ WriterOptions, /* level */ Double) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(js.undefined)
        ret
    }
    @scala.inline
    def withDeclaration(value: (/* node */ XMLDeclaration, /* options */ WriterOptions, /* level */ Double) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declaration")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutDeclaration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declaration")(js.undefined)
        ret
    }
    @scala.inline
    def withDocType(value: (/* node */ XMLDocType, /* options */ WriterOptions, /* level */ Double) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docType")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutDocType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docType")(js.undefined)
        ret
    }
    @scala.inline
    def withDtdAttList(value: (/* node */ XMLDTDAttList, /* options */ WriterOptions, /* level */ Double) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtdAttList")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutDtdAttList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtdAttList")(js.undefined)
        ret
    }
    @scala.inline
    def withDtdElement(value: (/* node */ XMLDTDElement, /* options */ WriterOptions, /* level */ Double) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtdElement")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutDtdElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtdElement")(js.undefined)
        ret
    }
    @scala.inline
    def withDtdEntity(value: (/* node */ XMLDTDEntity, /* options */ WriterOptions, /* level */ Double) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtdEntity")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutDtdEntity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtdEntity")(js.undefined)
        ret
    }
    @scala.inline
    def withDtdNotation(value: (/* node */ XMLDTDNotation, /* options */ WriterOptions, /* level */ Double) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtdNotation")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutDtdNotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtdNotation")(js.undefined)
        ret
    }
    @scala.inline
    def withElement(value: (/* node */ XMLElement, /* options */ WriterOptions, /* level */ Double) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(js.undefined)
        ret
    }
    @scala.inline
    def withEndline(value: (/* node */ XMLNode, /* options */ WriterOptions, /* level */ Double) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endline")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutEndline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endline")(js.undefined)
        ret
    }
    @scala.inline
    def withIndent(value: (/* node */ XMLNode, /* options */ WriterOptions, /* level */ Double) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutIndent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenAttribute(value: (/* att */ XMLAttribute, /* options */ WriterOptions, /* level */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openAttribute")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOpenAttribute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openAttribute")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenNode(value: (/* node */ XMLNode, /* options */ WriterOptions, /* level */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openNode")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOpenNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openNode")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessingInstruction(value: (/* node */ XMLProcessingInstruction, /* options */ WriterOptions, /* level */ Double) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processingInstruction")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutProcessingInstruction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processingInstruction")(js.undefined)
        ret
    }
    @scala.inline
    def withRaw(value: (/* node */ XMLRaw, /* options */ WriterOptions, /* level */ Double) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutRaw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: (/* node */ XMLText, /* options */ WriterOptions, /* level */ Double) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

