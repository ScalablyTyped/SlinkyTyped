package typingsSlinky.tslint

import typingsSlinky.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typingsSlinky.tslint.libRulesCompletedDashDocsExclusionDescriptorsMod.IInputExclusionDescriptors
import typingsSlinky.tslint.libRulesCompletedDocsRuleMod.All
import typingsSlinky.tslint.libRulesCompletedDocsRuleMod._DocType
import typingsSlinky.tslint.libRulesCompletedDocsRuleMod._Location
import typingsSlinky.tslint.libRulesCompletedDocsRuleMod._Privacy
import typingsSlinky.tslint.libRulesCompletedDocsRuleMod._Visibility
import typingsSlinky.tslint.tslintMod.Rules.AbstractRule
import typingsSlinky.tslint.tslintStrings.`enum-members`
import typingsSlinky.tslint.tslintStrings.`private`
import typingsSlinky.tslint.tslintStrings.`protected`
import typingsSlinky.tslint.tslintStrings.all
import typingsSlinky.tslint.tslintStrings.classes
import typingsSlinky.tslint.tslintStrings.content
import typingsSlinky.tslint.tslintStrings.enums
import typingsSlinky.tslint.tslintStrings.existence
import typingsSlinky.tslint.tslintStrings.exported
import typingsSlinky.tslint.tslintStrings.functions
import typingsSlinky.tslint.tslintStrings.instance
import typingsSlinky.tslint.tslintStrings.interfaces
import typingsSlinky.tslint.tslintStrings.internal
import typingsSlinky.tslint.tslintStrings.locations
import typingsSlinky.tslint.tslintStrings.methods
import typingsSlinky.tslint.tslintStrings.namespaces
import typingsSlinky.tslint.tslintStrings.overloads
import typingsSlinky.tslint.tslintStrings.privacies
import typingsSlinky.tslint.tslintStrings.properties
import typingsSlinky.tslint.tslintStrings.public
import typingsSlinky.tslint.tslintStrings.static
import typingsSlinky.tslint.tslintStrings.tags
import typingsSlinky.tslint.tslintStrings.types
import typingsSlinky.tslint.tslintStrings.variables
import typingsSlinky.tslint.tslintStrings.visibilities
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/completedDocsRule", JSImport.Namespace)
@js.native
object libRulesCompletedDocsRuleMod extends js.Object {
  @js.native
  class Rule () extends AbstractRule {
    var getExclusionsMap: js.Any = js.native
  }
  
  trait _DocType extends js.Object
  
  trait _Location extends js.Object
  
  trait _Privacy extends js.Object
  
  trait _Visibility extends js.Object
  
  val ALL: all = js.native
  val ARGUMENT_CLASSES: classes = js.native
  val ARGUMENT_ENUMS: enums = js.native
  val ARGUMENT_ENUM_MEMBERS: `enum-members` = js.native
  val ARGUMENT_FUNCTIONS: functions = js.native
  val ARGUMENT_INTERFACES: interfaces = js.native
  val ARGUMENT_METHODS: methods = js.native
  val ARGUMENT_NAMESPACES: namespaces = js.native
  val ARGUMENT_PROPERTIES: properties = js.native
  val ARGUMENT_TYPES: types = js.native
  val ARGUMENT_VARIABLES: variables = js.native
  val DESCRIPTOR_LOCATIONS: locations = js.native
  val DESCRIPTOR_OVERLOADS: overloads = js.native
  val DESCRIPTOR_PRIVACIES: privacies = js.native
  val DESCRIPTOR_TAGS: tags = js.native
  val DESCRIPTOR_VISIBILITIES: visibilities = js.native
  val LOCATION_INSTANCE: instance = js.native
  val LOCATION_STATIC: static = js.native
  val PRIVACY_PRIVATE: `private` = js.native
  val PRIVACY_PROTECTED: `protected` = js.native
  val PRIVACY_PUBLIC: public = js.native
  val TAGS_FOR_CONTENT: content = js.native
  val TAGS_FOR_EXISTENCE: existence = js.native
  val VISIBILITY_EXPORTED: exported = js.native
  val VISIBILITY_INTERNAL: internal = js.native
  /* static members */
  @js.native
  object Rule extends js.Object {
    var ARGUMENT_DESCRIPTOR_BLOCK: Anon_PropertiesType = js.native
    var ARGUMENT_DESCRIPTOR_CLASS: Anon_PropertiesTypeAnonLocations = js.native
    var ARGUMENT_DESCRIPTOR_FUNCTION: Anon_PropertiesTypeAnonOverloads = js.native
    var ARGUMENT_DESCRIPTOR_METHOD: Anon_PropertiesTypeAnonLocationsOverloads = js.native
    var FAILURE_STRING_EXIST: String = js.native
    var defaultArguments: IInputExclusionDescriptors = js.native
    var metadata: IRuleMetadata = js.native
  }
  
  type All = all
  /* Rewritten from type alias, can be one of: 
    - typings.tslint.libRulesCompletedDocsRuleMod.All
    - typings.tslint.tslintStrings.classes
    - typings.tslint.tslintStrings.enums
    - typings.tslint.tslintStrings.`enum-members`
    - typings.tslint.tslintStrings.functions
    - typings.tslint.tslintStrings.interfaces
    - typings.tslint.tslintStrings.methods
    - typings.tslint.tslintStrings.namespaces
    - typings.tslint.tslintStrings.properties
    - typings.tslint.tslintStrings.types
    - typings.tslint.tslintStrings.variables
  */
  type DocType = _DocType | All
  /* Rewritten from type alias, can be one of: 
    - typings.tslint.libRulesCompletedDocsRuleMod.All
    - typings.tslint.tslintStrings.instance
    - typings.tslint.tslintStrings.static
  */
  type Location = _Location | All
  /* Rewritten from type alias, can be one of: 
    - typings.tslint.libRulesCompletedDocsRuleMod.All
    - typings.tslint.tslintStrings.`private`
    - typings.tslint.tslintStrings.`protected`
    - typings.tslint.tslintStrings.public
  */
  type Privacy = _Privacy | All
  /* Rewritten from type alias, can be one of: 
    - typings.tslint.libRulesCompletedDocsRuleMod.All
    - typings.tslint.tslintStrings.exported
    - typings.tslint.tslintStrings.internal
  */
  type Visibility = _Visibility | All
}

