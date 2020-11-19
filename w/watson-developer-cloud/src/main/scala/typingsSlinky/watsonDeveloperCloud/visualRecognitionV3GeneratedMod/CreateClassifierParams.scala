package typingsSlinky.watsonDeveloperCloud.visualRecognitionV3GeneratedMod

import typingsSlinky.ibmCloudSdkCore.helperMod.FileObject
import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `createClassifier` operation. */
@js.native
trait CreateClassifierParams extends js.Object {
  
  var headers: js.UndefOr[js.Object] = js.native
  
  /** The name of the new classifier. Encode special characters in UTF-8. */
  var name: String = js.native
  
  /** A .zip file of images that do not depict the visual subject of any of the classes of the new classifier. Must contain a minimum of 10 images. Encode special characters in the file name in UTF-8. */
  var negative_examples: js.UndefOr[ReadableStream | FileObject | Buffer] = js.native
  
  /** The filename for negative_examples. */
  var negative_examples_filename: js.UndefOr[String] = js.native
  
  /** A dictionary that contains the value for each classname. The value is a .zip file of images that depict the visual subject of a class in the new classifier. You can include more than one positive example file in a call. Specify the parameter name by appending `_positive_examples` to the class name. For example, `goldenretriever_positive_examples` creates the class **goldenretriever**. Include at least 10 images in .jpg or .png format. The minimum recommended image resolution is 32X32 pixels. The maximum number of images is 10,000 images or 100 MB per .zip file. Encode special characters in the file name in UTF-8. */
  var positive_examples: Map[String, ReadableStream | FileObject | Buffer] = js.native
  
  var return_response: js.UndefOr[Boolean] = js.native
}
object CreateClassifierParams {
  
  @scala.inline
  def apply(name: String, positive_examples: Map[String, ReadableStream | FileObject | Buffer]): CreateClassifierParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], positive_examples = positive_examples.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClassifierParams]
  }
  
  @scala.inline
  implicit class CreateClassifierParamsOps[Self <: CreateClassifierParams] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositive_examples(value: Map[String, ReadableStream | FileObject | Buffer]): Self = this.set("positive_examples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setNegative_examples(value: ReadableStream | FileObject | Buffer): Self = this.set("negative_examples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNegative_examples: Self = this.set("negative_examples", js.undefined)
    
    @scala.inline
    def setNegative_examples_filename(value: String): Self = this.set("negative_examples_filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNegative_examples_filename: Self = this.set("negative_examples_filename", js.undefined)
    
    @scala.inline
    def setReturn_response(value: Boolean): Self = this.set("return_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturn_response: Self = this.set("return_response", js.undefined)
  }
}
