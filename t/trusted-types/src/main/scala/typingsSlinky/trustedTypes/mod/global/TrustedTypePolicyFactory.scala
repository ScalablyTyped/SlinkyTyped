package typingsSlinky.trustedTypes.mod.global

import typingsSlinky.std.Pick
import typingsSlinky.trustedTypes.trustedTypesStrings.createHTML
import typingsSlinky.trustedTypes.trustedTypesStrings.createScript
import typingsSlinky.trustedTypes.trustedTypesStrings.createScriptURL
import typingsSlinky.trustedTypes.trustedTypesStrings.createURL
import typingsSlinky.trustedTypes.trustedTypesStrings.name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrustedTypePolicyFactory extends js.Object {
  
  @JSName("createPolicy")
  def createPolicy_createHTML(name: String, policyOptions: Pick[TrustedTypePolicyOptions, createHTML]): Pick[TrustedTypePolicy, name | createHTML] = js.native
  @JSName("createPolicy")
  def createPolicy_createHTML(name: String, policyOptions: Pick[TrustedTypePolicyOptions, createHTML], expose: Boolean): Pick[TrustedTypePolicy, name | createHTML] = js.native
  @JSName("createPolicy")
  def createPolicy_createScript(name: String, policyOptions: Pick[TrustedTypePolicyOptions, createScript]): Pick[TrustedTypePolicy, name | createScript] = js.native
  @JSName("createPolicy")
  def createPolicy_createScript(name: String, policyOptions: Pick[TrustedTypePolicyOptions, createScript], expose: Boolean): Pick[TrustedTypePolicy, name | createScript] = js.native
  @JSName("createPolicy")
  def createPolicy_createScriptURL(name: String, policyOptions: Pick[TrustedTypePolicyOptions, createScriptURL]): Pick[TrustedTypePolicy, name | createScriptURL] = js.native
  @JSName("createPolicy")
  def createPolicy_createScriptURL(name: String, policyOptions: Pick[TrustedTypePolicyOptions, createScriptURL], expose: Boolean): Pick[TrustedTypePolicy, name | createScriptURL] = js.native
  @JSName("createPolicy")
  def createPolicy_createURL(name: String, policyOptions: Pick[TrustedTypePolicyOptions, createURL]): Pick[TrustedTypePolicy, name | createURL] = js.native
  @JSName("createPolicy")
  def createPolicy_createURL(name: String, policyOptions: Pick[TrustedTypePolicyOptions, createURL], expose: Boolean): Pick[TrustedTypePolicy, name | createURL] = js.native
  
  var defaultPolicy: js.UndefOr[TrustedTypePolicy] = js.native
  
  var emptyHTML: TrustedHTML = js.native
  
  def getAttributeType(tagName: String, attrName: String): js.UndefOr[String] = js.native
  def getAttributeType(tagName: String, attrName: String, elemNs: js.UndefOr[scala.Nothing], attrNs: String): js.UndefOr[String] = js.native
  def getAttributeType(tagName: String, attrName: String, elemNs: String): js.UndefOr[String] = js.native
  def getAttributeType(tagName: String, attrName: String, elemNs: String, attrNs: String): js.UndefOr[String] = js.native
  
  def getPolicyNames(): js.Array[String] = js.native
  
  def getPropertyType(tagName: String, propName: String): js.UndefOr[String] = js.native
  def getPropertyType(tagName: String, propName: String, elemNs: String): js.UndefOr[String] = js.native
  
  def isHTML(value: js.Any): /* is trusted-types.trusted-types.<global>.TrustedHTML */ Boolean = js.native
  
  def isScript(value: js.Any): /* is trusted-types.trusted-types.<global>.TrustedScript */ Boolean = js.native
  
  def isScriptURL(value: js.Any): /* is trusted-types.trusted-types.<global>.TrustedScriptURL */ Boolean = js.native
  
  def isURL(value: js.Any): /* is trusted-types.trusted-types.<global>.TrustedURL */ Boolean = js.native
}
