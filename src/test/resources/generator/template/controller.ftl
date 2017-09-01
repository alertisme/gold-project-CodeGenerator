package ${basePackage};
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import com.dimeng.framework.controller.BaseController;

/**
* Created by ${author} on ${date}.
*/
@RequestMapping(value = "/{v}/${baseRequestMapping}", method = RequestMethod.POST, produces = {"application/json",
"application/xml"})
@ResponseBody
@ResponseStatus(HttpStatus.OK)
@RequiresRoles(value = {"SHOP", "PERSONAL"}, logical = Logical.OR)
public class ${modelNameUpperCamel}Controller extends BaseController  {

}
