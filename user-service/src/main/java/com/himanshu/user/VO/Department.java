package com.himanshu.user.VO;

public class Department {
    private Long departmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;

    public Department(Long departmentId, String departmentName, String departmentAddress, String departmentCode) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.departmentAddress = departmentAddress;
        this.departmentCode = departmentCode;
    }

    public Department() {
    }

    public Long getDepartmentId() {
        return this.departmentId;
    }

    public String getDepartmentName() {
        return this.departmentName;
    }

    public String getDepartmentAddress() {
        return this.departmentAddress;
    }

    public String getDepartmentCode() {
        return this.departmentCode;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setDepartmentAddress(String departmentAddress) {
        this.departmentAddress = departmentAddress;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Department)) return false;
        final Department other = (Department) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$departmentId = this.getDepartmentId();
        final Object other$departmentId = other.getDepartmentId();
        if (this$departmentId == null ? other$departmentId != null : !this$departmentId.equals(other$departmentId))
            return false;
        final Object this$departmentName = this.getDepartmentName();
        final Object other$departmentName = other.getDepartmentName();
        if (this$departmentName == null ? other$departmentName != null : !this$departmentName.equals(other$departmentName))
            return false;
        final Object this$departmentAddress = this.getDepartmentAddress();
        final Object other$departmentAddress = other.getDepartmentAddress();
        if (this$departmentAddress == null ? other$departmentAddress != null : !this$departmentAddress.equals(other$departmentAddress))
            return false;
        final Object this$departmentCode = this.getDepartmentCode();
        final Object other$departmentCode = other.getDepartmentCode();
        if (this$departmentCode == null ? other$departmentCode != null : !this$departmentCode.equals(other$departmentCode))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Department;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $departmentId = this.getDepartmentId();
        result = result * PRIME + ($departmentId == null ? 43 : $departmentId.hashCode());
        final Object $departmentName = this.getDepartmentName();
        result = result * PRIME + ($departmentName == null ? 43 : $departmentName.hashCode());
        final Object $departmentAddress = this.getDepartmentAddress();
        result = result * PRIME + ($departmentAddress == null ? 43 : $departmentAddress.hashCode());
        final Object $departmentCode = this.getDepartmentCode();
        result = result * PRIME + ($departmentCode == null ? 43 : $departmentCode.hashCode());
        return result;
    }

    public String toString() {
        return "Department(departmentId=" + this.getDepartmentId() + ", departmentName=" + this.getDepartmentName() + ", departmentAddress=" + this.getDepartmentAddress() + ", departmentCode=" + this.getDepartmentCode() + ")";
    }
}
