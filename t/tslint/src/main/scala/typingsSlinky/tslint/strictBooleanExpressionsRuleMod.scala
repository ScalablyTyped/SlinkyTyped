package typingsSlinky.tslint

import typingsSlinky.tslint.mod.Rules.TypedRule
import typingsSlinky.tslint.ruleMod.IOptions
import typingsSlinky.tslint.ruleMod.IRuleMetadata
import typingsSlinky.tslint.tslintNumbers.`0`
import typingsSlinky.tslint.tslintNumbers.`1`
import typingsSlinky.tslint.tslintNumbers.`2`
import typingsSlinky.tslint.tslintNumbers.`3`
import typingsSlinky.tslint.tslintNumbers.`4`
import typingsSlinky.tslint.tslintNumbers.`5`
import typingsSlinky.tslint.tslintNumbers.`6`
import typingsSlinky.tslint.tslintNumbers.`7`
import typingsSlinky.typescript.mod.BaseType
import typingsSlinky.typescript.mod.BinaryExpression
import typingsSlinky.typescript.mod.ConditionalExpression
import typingsSlinky.typescript.mod.DoStatement
import typingsSlinky.typescript.mod.ForStatement
import typingsSlinky.typescript.mod.IfStatement
import typingsSlinky.typescript.mod.PrefixUnaryExpression
import typingsSlinky.typescript.mod.Signature
import typingsSlinky.typescript.mod.Symbol
import typingsSlinky.typescript.mod.Type
import typingsSlinky.typescript.mod.TypeFlags
import typingsSlinky.typescript.mod.WhileStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object strictBooleanExpressionsRuleMod {
  
  @JSImport("tslint/lib/rules/strictBooleanExpressionsRule", "Rule")
  @js.native
  class Rule protected () extends TypedRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/strictBooleanExpressionsRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/strictBooleanExpressionsRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    @scala.inline
    def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
  
  type Location = PrefixUnaryExpression | IfStatement | WhileStatement | DoStatement | ForStatement | ConditionalExpression | BinaryExpression
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.tslint.tslintNumbers.`0`
    - typingsSlinky.tslint.tslintNumbers.`1`
    - typingsSlinky.tslint.tslintNumbers.`2`
    - typingsSlinky.tslint.tslintNumbers.`3`
    - typingsSlinky.tslint.tslintNumbers.`4`
    - typingsSlinky.tslint.tslintNumbers.`5`
    - typingsSlinky.tslint.tslintNumbers.`6`
    - typingsSlinky.tslint.tslintNumbers.`7`
  */
  trait TypeFailure extends StObject
  object TypeFailure {
    
    @scala.inline
    def AlwaysFalsy: `1` = 1.asInstanceOf[`1`]
    
    @scala.inline
    def AlwaysTruthy: `0` = 0.asInstanceOf[`0`]
    
    @scala.inline
    def Enum: `6` = 6.asInstanceOf[`6`]
    
    @scala.inline
    def Mixes: `7` = 7.asInstanceOf[`7`]
    
    @scala.inline
    def Null: `4` = 4.asInstanceOf[`4`]
    
    @scala.inline
    def Number: `3` = 3.asInstanceOf[`3`]
    
    @scala.inline
    def String: `2` = 2.asInstanceOf[`2`]
    
    @scala.inline
    def Undefined: `5` = 5.asInstanceOf[`5`]
  }
  
  /* augmented module */
  object typescriptAugmentingMod {
    
    @js.native
    trait IntrinsicType extends Type {
      
      var intrinsicName: String = js.native
    }
    object IntrinsicType {
      
      @scala.inline
      def apply(
        flags: TypeFlags,
        getApparentProperties: () => js.Array[Symbol],
        getBaseTypes: () => js.UndefOr[js.Array[BaseType]],
        getCallSignatures: () => js.Array[Signature],
        getConstraint: () => js.UndefOr[Type],
        getConstructSignatures: () => js.Array[Signature],
        getDefault: () => js.UndefOr[Type],
        getFlags: () => TypeFlags,
        getNonNullableType: () => Type,
        getNumberIndexType: () => js.UndefOr[Type],
        getProperties: () => js.Array[Symbol],
        getProperty: String => js.UndefOr[Symbol],
        getStringIndexType: () => js.UndefOr[Type],
        getSymbol: () => js.UndefOr[Symbol],
        intrinsicName: String,
        isClass: () => /* is typescript.typescript.InterfaceType */ Boolean,
        isClassOrInterface: () => /* is typescript.typescript.InterfaceType */ Boolean,
        isIntersection: () => /* is typescript.typescript.IntersectionType */ Boolean,
        isLiteral: () => /* is typescript.typescript.LiteralType */ Boolean,
        isNumberLiteral: () => /* is typescript.typescript.NumberLiteralType */ Boolean,
        isStringLiteral: () => /* is typescript.typescript.StringLiteralType */ Boolean,
        isTypeParameter: () => /* is typescript.typescript.TypeParameter */ Boolean,
        isUnion: () => /* is typescript.typescript.UnionType */ Boolean,
        isUnionOrIntersection: () => /* is typescript.typescript.UnionOrIntersectionType */ Boolean,
        symbol: Symbol
      ): IntrinsicType = {
        val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], getApparentProperties = js.Any.fromFunction0(getApparentProperties), getBaseTypes = js.Any.fromFunction0(getBaseTypes), getCallSignatures = js.Any.fromFunction0(getCallSignatures), getConstraint = js.Any.fromFunction0(getConstraint), getConstructSignatures = js.Any.fromFunction0(getConstructSignatures), getDefault = js.Any.fromFunction0(getDefault), getFlags = js.Any.fromFunction0(getFlags), getNonNullableType = js.Any.fromFunction0(getNonNullableType), getNumberIndexType = js.Any.fromFunction0(getNumberIndexType), getProperties = js.Any.fromFunction0(getProperties), getProperty = js.Any.fromFunction1(getProperty), getStringIndexType = js.Any.fromFunction0(getStringIndexType), getSymbol = js.Any.fromFunction0(getSymbol), intrinsicName = intrinsicName.asInstanceOf[js.Any], isClass = js.Any.fromFunction0(isClass), isClassOrInterface = js.Any.fromFunction0(isClassOrInterface), isIntersection = js.Any.fromFunction0(isIntersection), isLiteral = js.Any.fromFunction0(isLiteral), isNumberLiteral = js.Any.fromFunction0(isNumberLiteral), isStringLiteral = js.Any.fromFunction0(isStringLiteral), isTypeParameter = js.Any.fromFunction0(isTypeParameter), isUnion = js.Any.fromFunction0(isUnion), isUnionOrIntersection = js.Any.fromFunction0(isUnionOrIntersection), symbol = symbol.asInstanceOf[js.Any])
        __obj.asInstanceOf[IntrinsicType]
      }
      
      @scala.inline
      implicit class IntrinsicTypeMutableBuilder[Self <: IntrinsicType] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setIntrinsicName(value: String): Self = StObject.set(x, "intrinsicName", value.asInstanceOf[js.Any])
      }
    }
  }
}
