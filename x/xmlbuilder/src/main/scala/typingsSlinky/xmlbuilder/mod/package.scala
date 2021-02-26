package typingsSlinky.xmlbuilder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /**
    * A function to be called when a chunk of XML is written.
    * 
    * @param chunk - a chunk of string that was written
    * @param level - current depth of the XML tree
    */
  type OnDataCallback = js.Function2[/* chunk */ java.lang.String, /* level */ scala.Double, scala.Unit]
  
  /**
    * A function to be called when the XML doucment is completed.
    */
  type OnEndCallback = js.Function0[scala.Unit]
  
  /**
    * Creates a new XML document and returns the document node.
    * This function creates an empty document without the XML prolog or
    * a root element.
    * 
    * @param options - create options
    */
  @scala.inline
  def begin(): typingsSlinky.xmlbuilder.mod.XMLDocument = typingsSlinky.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("begin")().asInstanceOf[typingsSlinky.xmlbuilder.mod.XMLDocument]
  @scala.inline
  def begin(
    options: js.UndefOr[scala.Nothing],
    onData: js.UndefOr[scala.Nothing],
    onEnd: typingsSlinky.xmlbuilder.mod.OnEndCallback
  ): typingsSlinky.xmlbuilder.mod.XMLDocumentCB = (typingsSlinky.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("begin")(options.asInstanceOf[js.Any], onData.asInstanceOf[js.Any], onEnd.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.xmlbuilder.mod.XMLDocumentCB]
  @scala.inline
  def begin(options: js.UndefOr[scala.Nothing], onData: typingsSlinky.xmlbuilder.mod.OnDataCallback): typingsSlinky.xmlbuilder.mod.XMLDocumentCB = (typingsSlinky.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("begin")(options.asInstanceOf[js.Any], onData.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.xmlbuilder.mod.XMLDocumentCB]
  @scala.inline
  def begin(
    options: js.UndefOr[scala.Nothing],
    onData: typingsSlinky.xmlbuilder.mod.OnDataCallback,
    onEnd: typingsSlinky.xmlbuilder.mod.OnEndCallback
  ): typingsSlinky.xmlbuilder.mod.XMLDocumentCB = (typingsSlinky.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("begin")(options.asInstanceOf[js.Any], onData.asInstanceOf[js.Any], onEnd.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.xmlbuilder.mod.XMLDocumentCB]
  @scala.inline
  def begin(options: js.UndefOr[scala.Nothing], onData: typingsSlinky.xmlbuilder.mod.OnEndCallback): typingsSlinky.xmlbuilder.mod.XMLDocumentCB = (typingsSlinky.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("begin")(options.asInstanceOf[js.Any], onData.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.xmlbuilder.mod.XMLDocumentCB]
  @scala.inline
  def begin(
    options: js.UndefOr[scala.Nothing],
    onData: typingsSlinky.xmlbuilder.mod.OnEndCallback,
    onEnd: typingsSlinky.xmlbuilder.mod.OnEndCallback
  ): typingsSlinky.xmlbuilder.mod.XMLDocumentCB = (typingsSlinky.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("begin")(options.asInstanceOf[js.Any], onData.asInstanceOf[js.Any], onEnd.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.xmlbuilder.mod.XMLDocumentCB]
  @scala.inline
  def begin(options: typingsSlinky.xmlbuilder.mod.BeginOptions): typingsSlinky.xmlbuilder.mod.XMLDocument = typingsSlinky.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("begin")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.xmlbuilder.mod.XMLDocument]
  @scala.inline
  def begin(
    options: typingsSlinky.xmlbuilder.mod.BeginOptions,
    onData: js.UndefOr[scala.Nothing],
    onEnd: typingsSlinky.xmlbuilder.mod.OnEndCallback
  ): typingsSlinky.xmlbuilder.mod.XMLDocumentCB = (typingsSlinky.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("begin")(options.asInstanceOf[js.Any], onData.asInstanceOf[js.Any], onEnd.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.xmlbuilder.mod.XMLDocumentCB]
  @scala.inline
  def begin(
    options: typingsSlinky.xmlbuilder.mod.BeginOptions,
    onData: typingsSlinky.xmlbuilder.mod.OnDataCallback
  ): typingsSlinky.xmlbuilder.mod.XMLDocumentCB = (typingsSlinky.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("begin")(options.asInstanceOf[js.Any], onData.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.xmlbuilder.mod.XMLDocumentCB]
  @scala.inline
  def begin(
    options: typingsSlinky.xmlbuilder.mod.BeginOptions,
    onData: typingsSlinky.xmlbuilder.mod.OnDataCallback,
    onEnd: typingsSlinky.xmlbuilder.mod.OnEndCallback
  ): typingsSlinky.xmlbuilder.mod.XMLDocumentCB = (typingsSlinky.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("begin")(options.asInstanceOf[js.Any], onData.asInstanceOf[js.Any], onEnd.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.xmlbuilder.mod.XMLDocumentCB]
  @scala.inline
  def begin(
    options: typingsSlinky.xmlbuilder.mod.BeginOptions,
    onData: typingsSlinky.xmlbuilder.mod.OnEndCallback
  ): typingsSlinky.xmlbuilder.mod.XMLDocumentCB = (typingsSlinky.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("begin")(options.asInstanceOf[js.Any], onData.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.xmlbuilder.mod.XMLDocumentCB]
  @scala.inline
  def begin(
    options: typingsSlinky.xmlbuilder.mod.BeginOptions,
    onData: typingsSlinky.xmlbuilder.mod.OnEndCallback,
    onEnd: typingsSlinky.xmlbuilder.mod.OnEndCallback
  ): typingsSlinky.xmlbuilder.mod.XMLDocumentCB = (typingsSlinky.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("begin")(options.asInstanceOf[js.Any], onData.asInstanceOf[js.Any], onEnd.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.xmlbuilder.mod.XMLDocumentCB]
  @scala.inline
  def begin(options: typingsSlinky.xmlbuilder.mod.OnDataCallback): typingsSlinky.xmlbuilder.mod.XMLDocumentCB = typingsSlinky.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("begin")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.xmlbuilder.mod.XMLDocumentCB]
  @scala.inline
  def begin(
    options: typingsSlinky.xmlbuilder.mod.OnDataCallback,
    onData: js.UndefOr[scala.Nothing],
    onEnd: typingsSlinky.xmlbuilder.mod.OnEndCallback
  ): typingsSlinky.xmlbuilder.mod.XMLDocumentCB = (typingsSlinky.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("begin")(options.asInstanceOf[js.Any], onData.asInstanceOf[js.Any], onEnd.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.xmlbuilder.mod.XMLDocumentCB]
  @scala.inline
  def begin(
    options: typingsSlinky.xmlbuilder.mod.OnDataCallback,
    onData: typingsSlinky.xmlbuilder.mod.OnDataCallback
  ): typingsSlinky.xmlbuilder.mod.XMLDocumentCB = (typingsSlinky.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("begin")(options.asInstanceOf[js.Any], onData.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.xmlbuilder.mod.XMLDocumentCB]
  @scala.inline
  def begin(
    options: typingsSlinky.xmlbuilder.mod.OnDataCallback,
    onData: typingsSlinky.xmlbuilder.mod.OnDataCallback,
    onEnd: typingsSlinky.xmlbuilder.mod.OnEndCallback
  ): typingsSlinky.xmlbuilder.mod.XMLDocumentCB = (typingsSlinky.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("begin")(options.asInstanceOf[js.Any], onData.asInstanceOf[js.Any], onEnd.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.xmlbuilder.mod.XMLDocumentCB]
  @scala.inline
  def begin(
    options: typingsSlinky.xmlbuilder.mod.OnDataCallback,
    onData: typingsSlinky.xmlbuilder.mod.OnEndCallback
  ): typingsSlinky.xmlbuilder.mod.XMLDocumentCB = (typingsSlinky.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("begin")(options.asInstanceOf[js.Any], onData.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.xmlbuilder.mod.XMLDocumentCB]
  @scala.inline
  def begin(
    options: typingsSlinky.xmlbuilder.mod.OnDataCallback,
    onData: typingsSlinky.xmlbuilder.mod.OnEndCallback,
    onEnd: typingsSlinky.xmlbuilder.mod.OnEndCallback
  ): typingsSlinky.xmlbuilder.mod.XMLDocumentCB = (typingsSlinky.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("begin")(options.asInstanceOf[js.Any], onData.asInstanceOf[js.Any], onEnd.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.xmlbuilder.mod.XMLDocumentCB]
  
  /**
    * Creates a new XML document in callback mode and returns the document
    * node.
    * 
    * @param options - create options
    * @param onData - the function to be called when a new chunk of XML is
    * output. The string containing the XML chunk is passed to `onData` as
    * its first argument and the current depth of the tree is passed as its
    * second argument.
    * @param onEnd - the function to be called when the XML document is 
    * completed with `end`. `onEnd` does not receive any arguments.
    */
  @scala.inline
  def begin_XMLDocumentCB(): typingsSlinky.xmlbuilder.mod.XMLDocumentCB = typingsSlinky.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("begin")().asInstanceOf[typingsSlinky.xmlbuilder.mod.XMLDocumentCB]
  @scala.inline
  def begin_XMLDocumentCB(options: typingsSlinky.xmlbuilder.mod.BeginOptions): typingsSlinky.xmlbuilder.mod.XMLDocumentCB = typingsSlinky.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("begin")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.xmlbuilder.mod.XMLDocumentCB]
  
  /**
    * Creates a new XML document and returns the root element node.
    * 
    * @param nameOrObject - name of the root element or a JS object to be 
    * converted to an XML tree
    * @param xmldecOrOptions - XML declaration or create options
    * @param doctypeOrOptions - Doctype declaration or create options
    * @param options - create options
    */
  @scala.inline
  def create(nameOrObject: java.lang.String): typingsSlinky.xmlbuilder.mod.XMLElement = typingsSlinky.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("create")(nameOrObject.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.xmlbuilder.mod.XMLElement]
  @scala.inline
  def create(
    nameOrObject: java.lang.String,
    xmldecOrOptions: js.UndefOr[scala.Nothing],
    doctypeOrOptions: js.UndefOr[scala.Nothing],
    options: typingsSlinky.xmlbuilder.mod.CreateOptions
  ): typingsSlinky.xmlbuilder.mod.XMLElement = (typingsSlinky.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("create")(nameOrObject.asInstanceOf[js.Any], xmldecOrOptions.asInstanceOf[js.Any], doctypeOrOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.xmlbuilder.mod.XMLElement]
  @scala.inline
  def create(
    nameOrObject: java.lang.String,
    xmldecOrOptions: js.UndefOr[scala.Nothing],
    doctypeOrOptions: typingsSlinky.xmlbuilder.mod.CreateOptions
  ): typingsSlinky.xmlbuilder.mod.XMLElement = (typingsSlinky.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("create")(nameOrObject.asInstanceOf[js.Any], xmldecOrOptions.asInstanceOf[js.Any], doctypeOrOptions.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.xmlbuilder.mod.XMLElement]
  @scala.inline
  def create(
    nameOrObject: java.lang.String,
    xmldecOrOptions: js.UndefOr[scala.Nothing],
    doctypeOrOptions: typingsSlinky.xmlbuilder.mod.CreateOptions,
    options: typingsSlinky.xmlbuilder.mod.CreateOptions
  ): typingsSlinky.xmlbuilder.mod.XMLElement = (typingsSlinky.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("create")(nameOrObject.asInstanceOf[js.Any], xmldecOrOptions.asInstanceOf[js.Any], doctypeOrOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.xmlbuilder.mod.XMLElement]
  @scala.inline
  def create(nameOrObject: java.lang.String, xmldecOrOptions: typingsSlinky.xmlbuilder.mod.CreateOptions): typingsSlinky.xmlbuilder.mod.XMLElement = (typingsSlinky.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("create")(nameOrObject.asInstanceOf[js.Any], xmldecOrOptions.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.xmlbuilder.mod.XMLElement]
  @scala.inline
  def create(
    nameOrObject: java.lang.String,
    xmldecOrOptions: typingsSlinky.xmlbuilder.mod.CreateOptions,
    doctypeOrOptions: js.UndefOr[scala.Nothing],
    options: typingsSlinky.xmlbuilder.mod.CreateOptions
  ): typingsSlinky.xmlbuilder.mod.XMLElement = (typingsSlinky.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("create")(nameOrObject.asInstanceOf[js.Any], xmldecOrOptions.asInstanceOf[js.Any], doctypeOrOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.xmlbuilder.mod.XMLElement]
  @scala.inline
  def create(
    nameOrObject: java.lang.String,
    xmldecOrOptions: typingsSlinky.xmlbuilder.mod.CreateOptions,
    doctypeOrOptions: typingsSlinky.xmlbuilder.mod.CreateOptions
  ): typingsSlinky.xmlbuilder.mod.XMLElement = (typingsSlinky.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("create")(nameOrObject.asInstanceOf[js.Any], xmldecOrOptions.asInstanceOf[js.Any], doctypeOrOptions.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.xmlbuilder.mod.XMLElement]
  @scala.inline
  def create(
    nameOrObject: java.lang.String,
    xmldecOrOptions: typingsSlinky.xmlbuilder.mod.CreateOptions,
    doctypeOrOptions: typingsSlinky.xmlbuilder.mod.CreateOptions,
    options: typingsSlinky.xmlbuilder.mod.CreateOptions
  ): typingsSlinky.xmlbuilder.mod.XMLElement = (typingsSlinky.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("create")(nameOrObject.asInstanceOf[js.Any], xmldecOrOptions.asInstanceOf[js.Any], doctypeOrOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.xmlbuilder.mod.XMLElement]
  @scala.inline
  def create(nameOrObject: org.scalablytyped.runtime.StringDictionary[js.Object]): typingsSlinky.xmlbuilder.mod.XMLElement = typingsSlinky.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("create")(nameOrObject.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.xmlbuilder.mod.XMLElement]
  @scala.inline
  def create(
    nameOrObject: org.scalablytyped.runtime.StringDictionary[js.Object],
    xmldecOrOptions: js.UndefOr[scala.Nothing],
    doctypeOrOptions: js.UndefOr[scala.Nothing],
    options: typingsSlinky.xmlbuilder.mod.CreateOptions
  ): typingsSlinky.xmlbuilder.mod.XMLElement = (typingsSlinky.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("create")(nameOrObject.asInstanceOf[js.Any], xmldecOrOptions.asInstanceOf[js.Any], doctypeOrOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.xmlbuilder.mod.XMLElement]
  @scala.inline
  def create(
    nameOrObject: org.scalablytyped.runtime.StringDictionary[js.Object],
    xmldecOrOptions: js.UndefOr[scala.Nothing],
    doctypeOrOptions: typingsSlinky.xmlbuilder.mod.CreateOptions
  ): typingsSlinky.xmlbuilder.mod.XMLElement = (typingsSlinky.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("create")(nameOrObject.asInstanceOf[js.Any], xmldecOrOptions.asInstanceOf[js.Any], doctypeOrOptions.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.xmlbuilder.mod.XMLElement]
  @scala.inline
  def create(
    nameOrObject: org.scalablytyped.runtime.StringDictionary[js.Object],
    xmldecOrOptions: js.UndefOr[scala.Nothing],
    doctypeOrOptions: typingsSlinky.xmlbuilder.mod.CreateOptions,
    options: typingsSlinky.xmlbuilder.mod.CreateOptions
  ): typingsSlinky.xmlbuilder.mod.XMLElement = (typingsSlinky.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("create")(nameOrObject.asInstanceOf[js.Any], xmldecOrOptions.asInstanceOf[js.Any], doctypeOrOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.xmlbuilder.mod.XMLElement]
  @scala.inline
  def create(
    nameOrObject: org.scalablytyped.runtime.StringDictionary[js.Object],
    xmldecOrOptions: typingsSlinky.xmlbuilder.mod.CreateOptions
  ): typingsSlinky.xmlbuilder.mod.XMLElement = (typingsSlinky.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("create")(nameOrObject.asInstanceOf[js.Any], xmldecOrOptions.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.xmlbuilder.mod.XMLElement]
  @scala.inline
  def create(
    nameOrObject: org.scalablytyped.runtime.StringDictionary[js.Object],
    xmldecOrOptions: typingsSlinky.xmlbuilder.mod.CreateOptions,
    doctypeOrOptions: js.UndefOr[scala.Nothing],
    options: typingsSlinky.xmlbuilder.mod.CreateOptions
  ): typingsSlinky.xmlbuilder.mod.XMLElement = (typingsSlinky.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("create")(nameOrObject.asInstanceOf[js.Any], xmldecOrOptions.asInstanceOf[js.Any], doctypeOrOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.xmlbuilder.mod.XMLElement]
  @scala.inline
  def create(
    nameOrObject: org.scalablytyped.runtime.StringDictionary[js.Object],
    xmldecOrOptions: typingsSlinky.xmlbuilder.mod.CreateOptions,
    doctypeOrOptions: typingsSlinky.xmlbuilder.mod.CreateOptions
  ): typingsSlinky.xmlbuilder.mod.XMLElement = (typingsSlinky.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("create")(nameOrObject.asInstanceOf[js.Any], xmldecOrOptions.asInstanceOf[js.Any], doctypeOrOptions.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.xmlbuilder.mod.XMLElement]
  @scala.inline
  def create(
    nameOrObject: org.scalablytyped.runtime.StringDictionary[js.Object],
    xmldecOrOptions: typingsSlinky.xmlbuilder.mod.CreateOptions,
    doctypeOrOptions: typingsSlinky.xmlbuilder.mod.CreateOptions,
    options: typingsSlinky.xmlbuilder.mod.CreateOptions
  ): typingsSlinky.xmlbuilder.mod.XMLElement = (typingsSlinky.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("create")(nameOrObject.asInstanceOf[js.Any], xmldecOrOptions.asInstanceOf[js.Any], doctypeOrOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.xmlbuilder.mod.XMLElement]
  
  /**
    * Creates and returns a default stream writer.
    * 
    * @param stream - a writeable stream
    * @param options - writer options
    */
  @scala.inline
  def streamWriter(stream: typingsSlinky.node.streamMod.Writable): typingsSlinky.xmlbuilder.mod.XMLWriter = typingsSlinky.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("streamWriter")(stream.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.xmlbuilder.mod.XMLWriter]
  @scala.inline
  def streamWriter(stream: typingsSlinky.node.streamMod.Writable, options: typingsSlinky.xmlbuilder.mod.WriterOptions): typingsSlinky.xmlbuilder.mod.XMLWriter = (typingsSlinky.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("streamWriter")(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.xmlbuilder.mod.XMLWriter]
  
  /**
    * Creates and returns a default string writer.
    * 
    * @param options - writer options
    */
  @scala.inline
  def stringWriter(): typingsSlinky.xmlbuilder.mod.XMLWriter = typingsSlinky.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("stringWriter")().asInstanceOf[typingsSlinky.xmlbuilder.mod.XMLWriter]
  @scala.inline
  def stringWriter(options: typingsSlinky.xmlbuilder.mod.WriterOptions): typingsSlinky.xmlbuilder.mod.XMLWriter = typingsSlinky.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("stringWriter")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.xmlbuilder.mod.XMLWriter]
}
