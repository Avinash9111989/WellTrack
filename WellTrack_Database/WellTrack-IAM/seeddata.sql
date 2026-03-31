-- Seed Users
INSERT INTO users (name, email, password, role, phone, status)
VALUES
('Alice Employee', 'alice@welltrack.com', '$2a$10$encodedPassword1', 'EMPLOYEE', '9876543210', 'ACTIVE'),
('Bob HR', 'bob@welltrack.com', '$2a$10$encodedPassword2', 'HR', '9876543211', 'ACTIVE'),
('Charlie Coach', 'charlie@welltrack.com', '$2a$10$encodedPassword3', 'COACH', '9876543212', 'ACTIVE'),
('Diana Compliance', 'diana@welltrack.com', '$2a$10$encodedPassword4', 'COMPLIANCE', '9876543213', 'ACTIVE'),
('Admin User', 'admin@welltrack.com', '$2a$10$encodedPassword5', 'ADMIN', '9876543214', 'ACTIVE');

-- Seed Audit Logs
INSERT INTO audit_logs (user_id, action, resource)
VALUES
(1, 'CREATE', 'USER'),
(2, 'UPDATE', 'USER'),
(3, 'ROLE_CHANGE', 'USER'),
(4, 'DEACTIVATE', 'USER'),
(5, 'DELETE', 'USER');
