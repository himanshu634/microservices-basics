package com.himanshu.user.VO;

import com.himanshu.user.entity.User;

public class ResponseTemplateVO {
    private User user;
    private Department department;

    public ResponseTemplateVO(User user, Department department) {
        this.user = user;
        this.department = department;
    }

    public ResponseTemplateVO() {
    }

    public User getUser() {
        return this.user;
    }

    public Department getDepartment() {
        return this.department;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ResponseTemplateVO)) return false;
        final ResponseTemplateVO other = (ResponseTemplateVO) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$user = this.getUser();
        final Object other$user = other.getUser();
        if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
        final Object this$department = this.getDepartment();
        final Object other$department = other.getDepartment();
        if (this$department == null ? other$department != null : !this$department.equals(other$department))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ResponseTemplateVO;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $user = this.getUser();
        result = result * PRIME + ($user == null ? 43 : $user.hashCode());
        final Object $department = this.getDepartment();
        result = result * PRIME + ($department == null ? 43 : $department.hashCode());
        return result;
    }

    public String toString() {
        return "ResponseTemplateVO(user=" + this.getUser() + ", department=" + this.getDepartment() + ")";
    }
}
