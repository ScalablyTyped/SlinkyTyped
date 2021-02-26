package typingsSlinky.stripe.mod

import typingsSlinky.stripe.anon.Data
import typingsSlinky.stripe.stripeStrings.file
import typingsSlinky.stripe.stripeStrings.jpg
import typingsSlinky.stripe.stripeStrings.pdf
import typingsSlinky.stripe.stripeStrings.png
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object files {
  
  @js.native
  trait IFileCreationOptions extends IDataOptions {
    
    var file: Data = js.native
    
    var purpose: IPurpose = js.native
  }
  object IFileCreationOptions {
    
    @scala.inline
    def apply(file: Data, purpose: IPurpose): IFileCreationOptions = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], purpose = purpose.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFileCreationOptions]
    }
    
    @scala.inline
    implicit class IFileCreationOptionsMutableBuilder[Self <: IFileCreationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile(value: Data): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPurpose(value: IPurpose): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IFileListOptions extends IListOptionsCreated {
    
    /**
      * The file purpose to filter queries by. If none is provided, files will not be
      * filtered by purpose.
      */
    var purpose: IPurpose = js.native
  }
  object IFileListOptions {
    
    @scala.inline
    def apply(purpose: IPurpose): IFileListOptions = {
      val __obj = js.Dynamic.literal(purpose = purpose.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFileListOptions]
    }
    
    @scala.inline
    implicit class IFileListOptionsMutableBuilder[Self <: IFileListOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPurpose(value: IPurpose): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IFileUpdate extends IResourceObject {
    
    var created: Double = js.native
    
    /**
      * Value is "file"
      */
    @JSName("object")
    var object_IFileUpdate: file = js.native
    
    /**
      * The purpose of the uploaded file. Possible values are "business_logo",
      * "dispute_evidence", "identity_document", "incorporation_article",
      * "incorporation_document".
      */
    var purpose: IPurpose = js.native
    
    /**
      * The size in bytes of the file object.
      */
    var size: Double = js.native
    
    /**
      * The type of the file returned. Returns one of the following:
      * pdf, jpg, png.
      */
    var `type`: pdf | jpg | png = js.native
    
    /**
      * A read-only URL where the uploaded file can be accessed. Will be nil
      * unless the uploaded file has one of the following purposes:
      *  business_logo, dispute_evidence, incorporation_document.
      * Also nil if retrieved with the publishable API key.
      */
    var url: String = js.native
  }
  object IFileUpdate {
    
    @scala.inline
    def apply(
      created: Double,
      id: String,
      `object`: file,
      purpose: IPurpose,
      size: Double,
      `type`: pdf | jpg | png,
      url: String
    ): IFileUpdate = {
      val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], purpose = purpose.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFileUpdate]
    }
    
    @scala.inline
    implicit class IFileUpdateMutableBuilder[Self <: IFileUpdate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: file): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPurpose(value: IPurpose): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: pdf | jpg | png): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.stripe.stripeStrings.business_logo
    - typingsSlinky.stripe.stripeStrings.dispute_evidence
    - typingsSlinky.stripe.stripeStrings.identity_document
    - typingsSlinky.stripe.stripeStrings.incorporation_article
    - typingsSlinky.stripe.stripeStrings.incorporation_document
  */
  trait IPurpose extends StObject
  object IPurpose {
    
    @scala.inline
    def business_logo: typingsSlinky.stripe.stripeStrings.business_logo = "business_logo".asInstanceOf[typingsSlinky.stripe.stripeStrings.business_logo]
    
    @scala.inline
    def dispute_evidence: typingsSlinky.stripe.stripeStrings.dispute_evidence = "dispute_evidence".asInstanceOf[typingsSlinky.stripe.stripeStrings.dispute_evidence]
    
    @scala.inline
    def identity_document: typingsSlinky.stripe.stripeStrings.identity_document = "identity_document".asInstanceOf[typingsSlinky.stripe.stripeStrings.identity_document]
    
    @scala.inline
    def incorporation_article: typingsSlinky.stripe.stripeStrings.incorporation_article = "incorporation_article".asInstanceOf[typingsSlinky.stripe.stripeStrings.incorporation_article]
    
    @scala.inline
    def incorporation_document: typingsSlinky.stripe.stripeStrings.incorporation_document = "incorporation_document".asInstanceOf[typingsSlinky.stripe.stripeStrings.incorporation_document]
  }
}
