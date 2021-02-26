package typingsSlinky.tslint

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.tslint.ruleMod.RuleFailure
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatterMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.tslint.tslintStrings.human
    - typingsSlinky.tslint.tslintStrings.machine
  */
  trait ConsumerType extends StObject
  object ConsumerType {
    
    @scala.inline
    def human: typingsSlinky.tslint.tslintStrings.human = "human".asInstanceOf[typingsSlinky.tslint.tslintStrings.human]
    
    @scala.inline
    def machine: typingsSlinky.tslint.tslintStrings.machine = "machine".asInstanceOf[typingsSlinky.tslint.tslintStrings.machine]
  }
  
  @js.native
  trait FormatterConstructor extends Instantiable0[IFormatter]
  
  @js.native
  trait IFormatter extends StObject {
    
    /**
      * Formats linter results
      * @param failures Linter failures that were not fixed
      * @param fixes Fixed linter failures. Available when the `--fix` argument is used on the command line
      * @param fileNames All of the file paths that were linted
      */
    def format(failures: js.Array[RuleFailure]): String = js.native
    def format(failures: js.Array[RuleFailure], fixes: js.UndefOr[scala.Nothing], fileNames: js.Array[String]): String = js.native
    def format(failures: js.Array[RuleFailure], fixes: js.Array[RuleFailure]): String = js.native
    def format(failures: js.Array[RuleFailure], fixes: js.Array[RuleFailure], fileNames: js.Array[String]): String = js.native
  }
  
  @js.native
  trait IFormatterMetadata extends StObject {
    
    /**
      * Sample output from the formatter.
      */
    var consumer: ConsumerType = js.native
    
    /**
      * A short, one line description of what the formatter does.
      */
    var description: String = js.native
    
    /**
      * More elaborate details about the formatter.
      */
    var descriptionDetails: js.UndefOr[String] = js.native
    
    /**
      * The name of the formatter.
      */
    var formatterName: String = js.native
    
    /**
      * Sample output from the formatter.
      */
    var sample: String = js.native
  }
  object IFormatterMetadata {
    
    @scala.inline
    def apply(consumer: ConsumerType, description: String, formatterName: String, sample: String): IFormatterMetadata = {
      val __obj = js.Dynamic.literal(consumer = consumer.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], formatterName = formatterName.asInstanceOf[js.Any], sample = sample.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFormatterMetadata]
    }
    
    @scala.inline
    implicit class IFormatterMetadataMutableBuilder[Self <: IFormatterMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConsumer(value: ConsumerType): Self = StObject.set(x, "consumer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionDetails(value: String): Self = StObject.set(x, "descriptionDetails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionDetailsUndefined: Self = StObject.set(x, "descriptionDetails", js.undefined)
      
      @scala.inline
      def setFormatterName(value: String): Self = StObject.set(x, "formatterName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSample(value: String): Self = StObject.set(x, "sample", value.asInstanceOf[js.Any])
    }
  }
}
